parser grammar pi_calculos_grammar;

stmt : write | read | process_op |create_ch | if_cond | process_invoc | process_decl;

write : CAN HAT VAR;

read : CAN PAR VAR PAR;

process_op : CAP ( CON | PLUS ) CAP;

create_ch : PAR CRECH CAN PAR;

if_cond : IFF VAR (EQ | NEQ) VAR THEN oper;

process_invoc : CAP PAR parameters PAR ;

process_decl : CAP PAR parameters PAR PD (CAP | oper );

parameters : PAR ( CAN ',' | VAR ',' | CAN | VAR )* PAR ;

oper : PAR? ( write | read | if_cond | create_ch ) DOT oper PAR? | ;

