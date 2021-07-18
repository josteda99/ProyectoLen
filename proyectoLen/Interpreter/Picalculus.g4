grammar Picalculus;

@header{
package proyectoLen.src.antlr;
}

@parser::members {
public static boolean SEMANTIC_ERROR = false;
protected ArrayList<String> processScope = new ArrayList<String>();
}

prog : stmt* EOF;

stmt
	: processOp			#opra
	| process 			#dcla
	| oper 				#op;
write : Can Hat Var;

read : Can Par Var Par;

processOp : left=Cap ( Con | Plus ) right=Cap;

createCh : Par Crech Can Par;

ifCond : Iff Var (Eq | Neq) Var Then oper;
parameters : (Can | Var) (Colon (Can | Var))*;

/** 
	Declaracion de dlaraciones de procesos
	Esto podria ser usado para el manejo de erroes pero no se como funciona
	{!process.contains($Cap.text)}?<fail={"TEST\n"}> 
**/
process :
	Cap Par parameters Par (Pd oper)? 
	{if($Pd.text == null){
		if(!processScope.contains($Cap.text)){
			System.out.printf("Error line %d:%d -> Process %s not declared yet\n", $Cap.line, $Cap.pos, $Cap.text);
			SEMANTIC_ERROR = true;
		}
	} else {
		if(!processScope.contains($Cap.text)) processScope.add($Cap.text);
	}};

oper :( write | read  | createCh | ifCond ) 
    | oper Dot oper
    | ParA oper ParA
    | Spam oper 
    | Cap
	| Tao;

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
Par      : '(' | ')';
ParA     : '[' | ']';
Colon    : ',';
Ws       : [ \t\r\n]+ -> skip; 
Bcom	   : '/*' .*? '*/' -> skip;
Com      : '//' ~[\r\n]* '\r'? '\n' -> skip ;