grammar Picalculus;

@lexer::members {int variable = 0;}
@parser::members {String s = "";}

r : stmt* EOF;

stmt : processOp
	 | processInvoc 
	 | processDecl 
	 | oper; 

write : Can Hat Var;

read : Can Par Var Par;

processOp : Cap ( Con | Plus ) Cap;

createCh : Par Crech Can Par;

ifCond : Iff Var (Eq | Neq) Var Then oper;

processInvoc : Cap Par parameters Par;

parameters :  ( Can Colon | Var Colon | Can | Var )*;

// Declaracion de dlaraciones de procesos
processDecl : Cap Par parameters Par Pd oper;

oper :( write | read  | createCh | ifCond ) 
    | oper Dot oper
    | ParA oper ParA
    | Spam oper 
    | Cap
	| Tao;

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
Colon    : ',' -> skip;
Ws       : [ \t\r\n]+ -> skip; 
Bcom	   : '/*' .*? '*/' -> skip;
Com      : '//' ~[\r\n]* '\r'? '\n' -> skip ;

//A(a,b)::=(a/b'.a(c').&) if d' == e' then f/g'
//X(y,v) ::= [a/b'.a(c')].![if d' == e' then [f/g'.a/b'.a(c')]].&