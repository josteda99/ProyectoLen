lexer grammar picalculus;

tokens {CAP, CAM, VAR, IFF, DOT, THEN, EQ, NEQ, PD, HAT, TAO, WS, SPAM, CON ,PLUS, CRECH, PAR}

channels {
	WHITESPACE_CHANNEL,
	COMMENTS_CHANNEL
}



CAP      : [A-Z]+;
CAN      : [a-z];
VAR      : [a-z]'_';
IFF      : 'if';
DOT      : '.';   
THEN     : 'then';
EQ       : '==';
NEQ      : '!=';
PD       : '::=';
HAT      : '~';
TAO      : '^';
WS       : [ \t\r\n]+ -> channel(WHITESPACE_CHANNEL); 
SPAM     : '!';
CON      : '|';
PLUS     : '+';
CRECH    : '#';
PAR      : '(' | ')' ;
COM		 : '//' . -> channel(COMMENTS_CHANNEL);
BCOM	 : '/*' . '*/' -> channel(COMMENTS_CHANNEL);