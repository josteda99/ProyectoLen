grammar picalculus;

@lexer::members {int variable = 0;}
@parser::members {String s = "";}

r : stmt* EOF;

stmt : process_op
	 | process_invoc 
	 | process_decl 
	 | oper; 

write : Can Hat Var;

read : Can Par Var Par;

process_op : Cap ( Con | Plus ) Cap;

create_ch : Par Crech Can Par;

if_cond : Iff Var (Eq | Neq) Var Then oper;

process_invoc : Cap Par parameters Par;

parameters :  ( Can Colon | Var Colon | Can | Var )*;

// Declaracion de dlaraciones de procesos
process_decl : Cap Par parameters Par Pd oper;

oper :( write | read  | create_ch | if_cond ) 
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