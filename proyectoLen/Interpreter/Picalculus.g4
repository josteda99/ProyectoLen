grammar Picalculus;

@parser::header{
package proyectoLen.src.antlr;

import java.util.HashMap;
import proyectoLen.src.entity.Channel;
import proyectoLen.src.entity.Process;
}

@lexer::header{
package proyectoLen.src.antlr;
}

@parser::members {
public static boolean SEMANTIC_ERROR = false;
/**
 * @varScope indicara si una variable o canal estan libre o no  por medio de una bitmask
 * 1 -> libre
 * 2 -> binded
**/
protected static int FREE = 1;
protected static int BINDED = 2;
protected HashMap<String, Integer> chanScope = new HashMap<String, Integer>();
protected HashMap<String, Integer> varScope = new HashMap<String, Integer>();
protected HashMap<String, Channel> chanScopeGlobal = new HashMap<String, Channel>();
protected HashMap<String, Process> processScope  = new HashMap<String, Process>();
private static String aux = "";
}

prog
	@after{
		System.out.println(processScope.size());
		System.out.println(chanScopeGlobal.size());}
	: stmt*;

stmt
	@after{
		varScope.forEach((k, v) -> System.out.println(k + " -> " + v));
		varScope.replaceAll((k,v) -> FREE);}
	: process
	| run
	| globalChan
	| oper Dot Empty;

write
	: Can Hat Var
	{if(!chanScope.containsKey($Can.text)) {
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
	{if(!chanScope.containsKey($Can.text)) {
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

createCh : Par Crech Can Arrow Type Par
	{
		chanScope.putIfAbsent($Can.text, FREE);
	};

globalChan : 'new' Can DoDot Type 
	{
		/* Agregar a los canales globales */
		if($Type.text.equals("~Int"))
		   chanScopeGlobal.putIfAbsent($Can.text,new Channel<Integer>());
      	else 
		   chanScopeGlobal.putIfAbsent($Can.text,new Channel<String>());
	};
   
ifCond : Iff left=Var (Eq | Neq) right=Var Then oper
	{int value = varScope.getOrDefault($left.text, -1);
	if(value == -1 || (value & FREE) == FREE) {
      	System.out.printf("Error in Line %d:%d -> Variable %s is not free or not exist\n", $left.line, $left.pos, $left.text);
		SEMANTIC_ERROR = true;
		throw new RuntimeException();
	}
	value = varScope.getOrDefault($right.text, -1);
	if(value == -1 || (value & FREE) == FREE) {
		System.out.printf("Error in Line %d:%d -> Variable %s is not free or not exist\n", $right.line, $right.pos, $right.text);
		SEMANTIC_ERROR = true;
		throw new RuntimeException();
	}
	// se puede hacer comprobacion del if
	};

parameters
	: parameters Colon parameters
	| Can 	         {chanScope.putIfAbsent($Can.text, FREE); aux += $Can.text + ":";}
	| Var Arrow Type	{varScope.putIfAbsent($Var.text, FREE); aux += $Var.text + $Type.text + ":";}
	;


/** 
	Declaracion de dlaraciones de procesos
	Esto podria ser usado para el manejo de erroes pero no se como funciona
**/

process 
	locals[String name]
	@after {chanScope.clear();
			varScope.clear();
			processScope.putIfAbsent($name, new Process(" AUN FALTA LA SECUENCIA" ,aux.substring(0, aux.length() - 1)));
			aux = "";}:
	Cap ParA parameters ParA Pd oper 
	{
		if(!processScope.containsKey($Cap.text)) {
			$name = $Cap.text;
		} else {
			System.out.printf("Error in Line %d:%d -> Process %s already declared\n", $Cap.line, $Cap.pos, $Cap.text);
			SEMANTIC_ERROR = true;
			throw new RuntimeException();
		}
	};

run :
	'run' Cap ParA variables ParA 
	{	
      if(!processScope.containsKey($Cap.text)) {
         System.out.printf("Error in Line %d:%d -> Process %s no declared\n", $Cap.line, $Cap.pos, $Cap.text);
         SEMANTIC_ERROR = true;
         throw new RuntimeException();
      }
	};

variables 
   : variables Colon variables
   | Can
   {
	   if(!chanScopeGlobal.containsKey($Can.text)){
		   System.out.printf("Error in Line %d:%d -> Channel %s is not declared\n", $Can.line, $Can.pos, $Can.text);
		   SEMANTIC_ERROR = true;
		   throw new RuntimeException();
	    } else{
			aux += $Can.text + ":";
      }
   }
   | Int		{aux += $Int.int + ":";}
   | String		{aux += $String.text.substring(1, $String.text.length() - 1)+ ":";};

oper
	:( write | read  | createCh | ifCond )
    | ParA oper ParA
    | oper Dot oper			
	| oper Con oper
    | oper Plus oper
	| Spam oper
    | Cap	{
		if(!processScope.containsKey($Cap.text)) {
			System.out.printf("Error line %d:%d -> Process %s not declared yet\n", $Cap.line, $Cap.pos, $Cap.text);
			SEMANTIC_ERROR = true;
			throw new RuntimeException();
		}}
	| Tao;

/* Lexer tokens*/
Cap      	: [A-Z][a-zA-Z]*;
Can      	: Letter+;
Var      	: Letter+'\'';
Iff      	: 'if';
Dot      	: '.';
Then     	: 'then';
Eq       	: '==';
Neq      	: '!=';
Pd       	: '::=';
Hat      	: '/';
Tao      	: '&';
Spam     	: '!';
Con      	: '|';
Plus     	: '+';
Crech    	: '#';
Par      	: '[' | ']';
ParA     	: '(' | ')';
Colon    	: ',';
Ws       	: [ \t\r\n]+ -> skip; 
Bcom		: '/*' .*? '*/' -> skip;
Com			: '//' ~[\r\n]* '\r'? '\n' -> skip;
Empty       : '0';
DoDot		: '::';
Type		: '~'('Int' | 'String');
Arrow    	: '->';
Int			: [0-9]+;
String		: '"' ('\\' ["\\] | ~["\\\r\n])* '"' ;
fragment Letter	: [a-z];