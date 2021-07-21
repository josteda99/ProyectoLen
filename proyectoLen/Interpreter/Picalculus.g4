grammar Picalculus;

@parser::header{
package proyectoLen.src.antlr;

import java.util.HashMap;
}

@lexer::header{
package proyectoLen.src.antlr;
}

@parser::members {
public static boolean SEMANTIC_ERROR = false;
protected ArrayList<String> processScope = new ArrayList<String>();
/**
 * @varScope indicara si una variable o canal estan libre o no  por medio de una bitmask
 * 1 -> libre
 * 2 -> binded
**/
protected HashMap<String, Integer> varScope = new HashMap<String, Integer>();
protected static int FREE = 1;
protected static int BINDED = 2;
}

prog : stmt* EOF;

stmt
	@after{varScope.forEach((k, v) -> System.out.println(k + " -> " + v));}
	: process
	| oper;

write
	: Can Hat Var
	{if(!varScope.containsKey($Can.text)) {
		System.out.printf("Error in Line %d:%d -> Channel %s no declared\n", $Can.line, $Can.pos, $Can.text);
		SEMANTIC_ERROR = true;
		throw new RuntimeException();
	}
	int value = varScope.getOrDefault($Var.text, -1);
	if(value == -1) {
		varScope.putIfAbsent($Var.text, FREE);
	}
	// Usa la variable y luego la libera
	varScope.compute($Var.text, (k, v) -> v = FREE);};

read : Can Par Var Par
	{if(!varScope.containsKey($Can.text)) {
		System.out.printf("Error in Line %d:%d -> Channel %s no declared\n", $Can.line, $Can.pos, $Can.text);
		SEMANTIC_ERROR = true;
		throw new RuntimeException();
	}
	int value = varScope.getOrDefault($Var.text, -1);
	if(value == -1) {
		varScope.putIfAbsent($Var.text, FREE);
	} else if((value & FREE) != FREE) {
		System.out.printf("Error in Line %d:%d -> Variable %s is not free\n", $Var.line, $Var.pos, $Var.text);
		SEMANTIC_ERROR = true;
		throw new RuntimeException();
	}
	// Leé la variable y la bindea
	varScope.compute($Var.text, (k, v) -> v = BINDED);
	};

createCh : Par Crech Can Par
	{
		varScope.put($Can.text, FREE);
	};

ifCond : Iff Var (Eq | Neq) Var Then oper;

processOp : left=Cap ( Con | Plus ) right=Cap
		{if (!processScope.contains($left.text)) {
			System.out.printf("Error line %d:%d -> Process %s not declared yet\n", $left.line, $left.pos, $left.text);
			SEMANTIC_ERROR = true;
			throw new RuntimeException();
		}
		if (!processScope.contains($right.text)) {
			System.out.printf("Error line %d:%d -> Process %s not declared yet\n", $right.line, $right.pos, $right.text);
			SEMANTIC_ERROR = true;
			throw new RuntimeException();
		}};

parameters 
	@after {$para.forEach(x -> varScope.putIfAbsent(x.getText(), FREE));}
	: para+=(Can | Var) (Colon para+=(Can | Var))*;

/** 
	Declaracion de dlaraciones de procesos
	Esto podria ser usado para el manejo de erroes pero no se como funciona
**/
process :
	Cap Par parameters Par (Pd oper)? 
	{if($Pd.text == null) {
		if(!processScope.contains($Cap.text)) {
			System.out.printf("Error line %d:%d -> Process %s not declared yet\n", $Cap.line, $Cap.pos, $Cap.text);
			SEMANTIC_ERROR = true;
		}
	} else {
		if(!processScope.contains($Cap.text)) processScope.add($Cap.text);
	}};

oper :( write | read  | createCh | ifCond )
    | ParA oper ParA
    | oper Dot oper
	| processOp
    | Spam oper
    | Cap	{
		if(!processScope.contains($Cap.text)) {
			System.out.printf("Error line %d:%d -> Process %s not declared yet\n", $Cap.line, $Cap.pos, $Cap.text);
			SEMANTIC_ERROR = true;
			throw new RuntimeException();
		}}
	| Tao 	{varScope.replaceAll((k,v) -> FREE);} // Librera todas las variables de varScope 
	;

/* Lexer tokens*/
Cap      : [A-Z]+;
Can      : [a-z];
Var      : [a-z]'\'';
Iff      : 'if';
Dot      : '.';
Then     : 'then';
Eq       : '==';
Neq      : '!=';
Pd       : '::=';
Hat      : '/';
Tao      : '&';
Spam     : '!';
Con      : '|';
Plus     : '+';
Crech    : '#';
Par      : '[' | ']';
ParA     : '(' | ')';
Colon    : ',';
Ws       : [ \t\r\n]+ -> skip; 
Bcom	   : '/*' .*? '*/' -> skip;
Com		: '//' ~[\r\n]* '\r'? '\n' -> skip;