grammar T ;

options {
language=Java;
backtrack=true;
}



@members {
	Helper h= new Helper();
}


prog						: (stmt)+ 				
						;

stmt 						: assign 			
						| print 				
						| unpack 
						;

assign 						: n=ID '=' a=add				{h.variabledeclare($n.text, $a.val);}
						;


values	 	returns [expression val]		: v=val v2=values_tail 			{$val= h.merge($v.val,$v2.val);}
						| v1=values_tail				{$val= $v1.val;}
						;

values_tail 	returns [expression val]		: ',' v=val v2=values_tail 		{$val = h.merge($v.val,$v2.val);}
						| ')' 					{$val = new expression("ClosingParentheses");}
						;
		
val 		returns [expression val]		: s=String 				{$val=new expression ($s.text);}
						| I=intt					{$val=$I.val;}
						| t=tuple 				{$val=$t.val;}
						| id=ID					{$val=h.getVal($id.text);}
						;

add		returns [expression val]  	: a1=addint				{$val=$a1.val;}
						| a2=addstring				{$val=new expression($a2.val);}
						| a3=addid				{$val=$a3.val;}
						| a4=addtuple				{$val=$a4.val;}
						| a5=addslice				{$val=$a5.val;}
						;

addint		returns [expression val]		: i1=intt '+' a=add			{$val=h.addint($i1.val,$a.val);}
						| i2=intt				{$val=$i2.val;}
						;

addstring	returns [String val]		: s1=String '+' a=addstring		{$val=h.addstring($s1.text,$a.val);}
						| s2=String				{$val=$s2.text;}
						;

addtuple		returns [expression val]		: t1=tuple '+' a=add			{$val=h.addtuple($t1.val,$a.val);}
						| t2=tuple				{$val=$t2.val;}
						;

addid 		returns [expression val]		: n1=ID '+' a=add			{$val=h.add($n1.text,$a.val);}
						| n2=ID 					{$val=h.getVal($n2.text);}
						;

addslice		returns [expression val]		: s1=slice '+' a=add			{$val=h.addtuple($s1.val,$a.val);}
						| s2=slice				{$val=$s2.val;}
						;

print						: 'print''(' n=toprint 			{System.out.println($n.val);}
						;

toprint		returns [String val]		: v1=toprintval v2=toprintval_tail	{$val=$v1.val+$v2.val;}
						| v3=toprintval_tail			{$val=$v3.val;}
						;

toprintval_tail	returns [String val]		: ',' v1=toprintval v2=toprintval_tail	{$val=" "+$v1.val+$v2.val;}
						| ')'					{$val="";}
						;

toprintval	returns [String val]		: s=String				{$val=h.PrintString($s.text);}
						| I=intt					{$val=h.Printexpression($I.val);}
						| t=tuple				{$val=h.Printexpression($t.val);}
						| id=ID					{$val=h.PrintFormat($id.text);}
						| sl=slice				{$val=h.PrintSlice($sl.val);}
						;

unpack 						: '(' d=ids ')=' n=ID 			{h.unpacking($d.vals,$n.text);}
						;

ids 		returns [List<String> vals]	: n=ID ',' id1=ids 			{$vals = h.addids($n.text, $id1.vals);}
						| n1=ID 					{$vals = h.addids($n1.text);}
						; 

intt 		returns [expression val]		: n=Num					{$val=new expression($n.int);}
						| '-'n=Num				{$val=new expression(-$n.int);}
						;

tuple		returns [expression val]		: '(' v=values 				{$val=h.ToTuple($v.val);}
						;

slice 		returns [expression val]		: d=ID 	'[' n=Num ']' 			{$val=h.slice($d.text,$n.int);}
						| d1=ID	'[' n1=Num ':' n2=Num ']' 	{$val=h.slice($d1.text,$n1.int,$n2.int);}
						| d2=ID	'[:' n=Num ']' 			{$val=h.slice($d2.text,0,$n.int);}
						| d3=ID	'[' n=Num ':]' 			{$val=h.slice($d3.text,$n.int,-1);}
						| d4=ID 	'[-' n=Num ']' 			{$val=h.slice($d4.text,h.negative($n.int));}
						| d5=ID	'[-' n1=Num ':' n2=Num ']' 	{$val=h.slice($d5.text,h.negative($n1.int),$n2.int);}
						| d6=ID	'[:-' n=Num ']' 			{$val=h.slice($d6.text,0,h.negative($n.int));}
						| d7=ID	'[-' n=Num ':]' 			{$val=h.slice($d7.text,h.negative($n.int),-1);}
						| d8=ID	'[-' n1=Num ':-' n2=Num ']' 	{$val=h.slice($d8.text,h.negative($n1.int),h.negative($n2.int));}
						| d9=ID	'[' n1=Num ':-' n2=Num ']' 	{$val=h.slice($d9.text,$n1.int,h.negative($n2.int));}
						;



fragment Letter					: ('a'..'z' | 'A'..'Z' )			
						;
fragment Digit					: '0'..'9' 				
						;
Num						: Digit(Digit)* 				
						;
ID						: Letter(Letter|Digit|'_')* 
						;
String	 					: ('"' ~ ('"')+'"') | ('\'' ~ ('\'')+'\'')			
						;
WS						: ( ' ' | '\n' | '\t' | '\r' )+ {skip();}
						;
COMMENTS 					: '#'~('\n'|'\r')* {skip();} 
						;
		