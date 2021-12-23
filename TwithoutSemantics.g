grammar T ;

options {
backtrack=true;
}

prog		: (stmt)+ 
		;

stmt 		: assign 
		| print
		| unpack 
		;

assign 		: ID '=' add
		;

values		: val values_tail 
		| values_tail	
		;

values_tail	: ',' val values_tail 
		| ')' 
		;

val 		: String
		| intt 
		| tuple 
		| ID
		;

add 		: addint	
		| addstring		
		| addid
		| addtuple	
		| addslice
		;

addint		: intt '+' add			
		| intt				
		;

addstring	: String '+' addstring		
		| String				
		;

addtuple		: tuple '+' add			
		| tuple				
		;

addid 		: ID '+' add		
		| ID 					
		;

addslice		: s1=slice '+' a=add			
		| s2=slice				
		;
print		: 'print''(' toprint 			
		;

toprint		: toprintval toprintval_tail
		| toprintval_tail	
		;

toprintval_tail	: ',' toprintval toprintval_tail	
		| ')'					
		;

toprintval	: String				
		| intt					
		| tuple				
		| ID					
		| slice				
		;

unpack 		: '(' ids ')=' ID 			
		;

ids 		: ID ',' ids 			
		| ID 					
		; 

intt 		: Num					
		| '-'Num				
		;

tuple		: '(' values 				
		;

slice 		: ID 	'['   Num ']' 			
		| ID	'['   Num ':'  Num ']' 	
		| ID	'[:'  Num ']' 			
		| ID	'['   Num ':]' 			
		| ID 	'[-'  Num ']'			
		| ID	'[-'  Num ':'  Num ']' 	
		| ID	'[:-' Num ']' 			
		| ID	'[-'  Num ':]' 			
		| ID	'[-'  Num ':-' Num ']' 	
		| ID	'['   Num ':-' Num ']' 	
		;


fragment Letter 	: ('a'..'z' | 'A'..'Z' ) 
		;
fragment Digit 	: '0'..'9' 
		;
Num		: Digit(Digit)* 
		;
ID 		: Letter(Letter | Digit|'_')* 
		;
String	 	: '"' (Letter|Digit|' '|'='|'['|']'|'&'|'-'|'_'|'.'|'/'|'+'|'?'|':'|'('|')'|',')* '"'	 			
		;				;
WS		: ( ' ' | '\n' | '\t' | '\r' )+ { skip(); } 
		;
COMMENTS 	: ('#') ~ ('\n'|'\r')* {skip();} 
		;
		
