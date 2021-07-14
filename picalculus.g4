grammar picalculus;

@lexer::members {int variable = 0;}
@parser::members {String s = "";}

Cap      : [A-Z]+;
Can      : [a-z];
Var      : [a-z]'_';
Iff      : 'if';
Dot      : '.';
Then     : 'then';
Eq       : '==';
Neq      : '!=';
Pd       : '::=';
Hat      : '~';
Tao      : '^';
Spam     : '!';
Con      : '|';
Plus     : '+';
Crech    : '#';
Par      : '(' | ')';
Ws       : [ \t\r\n]+ -> channel(HIDDEN); 
Com		 : '//' . -> channel(HIDDEN);
Bcom	 : '/*' . '*/' -> channel(HIDDEN);

prog : stmt EOF;

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
parameters : Par ( Can ',' | Var ',' | Can | Var )* Par ;

// Declaracion de dlaraciones de procesos
process_decl : Cap Par parameters Par Pd (Cap | oper );
oper : Par? Spam? ( write | read | if_cond | create_ch ) Dot oper Par?
	 | Tao;