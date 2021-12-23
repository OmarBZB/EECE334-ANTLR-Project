// $ANTLR 3.5.2 T.g 2021-05-04 13:16:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class TParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENTS", "Digit", "ID", "Letter", 
		"Num", "String", "WS", "'('", "')'", "')='", "'+'", "','", "'-'", "':'", 
		"':-'", "':]'", "'='", "'['", "'[-'", "'[:'", "'[:-'", "']'", "'print'"
	};
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int COMMENTS=4;
	public static final int Digit=5;
	public static final int ID=6;
	public static final int Letter=7;
	public static final int Num=8;
	public static final int String=9;
	public static final int WS=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public TParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public TParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return TParser.tokenNames; }
	@Override public String getGrammarFileName() { return "T.g"; }


		Helper h= new Helper();



	// $ANTLR start "prog"
	// T.g:15:1: prog : ( stmt )+ ;
	public final void prog() throws RecognitionException {
		try {
			// T.g:15:11: ( ( stmt )+ )
			// T.g:15:13: ( stmt )+
			{
			// T.g:15:13: ( stmt )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==11||LA1_0==26) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// T.g:15:14: stmt
					{
					pushFollow(FOLLOW_stmt_in_prog41);
					stmt();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "stmt"
	// T.g:18:1: stmt : ( assign | print | unpack );
	public final void stmt() throws RecognitionException {
		try {
			// T.g:18:12: ( assign | print | unpack )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 26:
				{
				alt2=2;
				}
				break;
			case 11:
				{
				alt2=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// T.g:18:14: assign
					{
					pushFollow(FOLLOW_assign_in_stmt69);
					assign();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// T.g:19:9: print
					{
					pushFollow(FOLLOW_print_in_stmt83);
					print();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// T.g:20:9: unpack
					{
					pushFollow(FOLLOW_unpack_in_stmt98);
					unpack();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stmt"



	// $ANTLR start "assign"
	// T.g:23:1: assign : n= ID '=' a= add ;
	public final void assign() throws RecognitionException {
		Token n=null;
		expression a =null;

		try {
			// T.g:23:14: (n= ID '=' a= add )
			// T.g:23:16: n= ID '=' a= add
			{
			n=(Token)match(input,ID,FOLLOW_ID_in_assign122); if (state.failed) return;
			match(input,20,FOLLOW_20_in_assign124); if (state.failed) return;
			pushFollow(FOLLOW_add_in_assign128);
			a=add();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {h.variabledeclare((n!=null?n.getText():null), a);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assign"



	// $ANTLR start "values"
	// T.g:27:1: values returns [expression val] : (v= val v2= values_tail |v1= values_tail );
	public final expression values() throws RecognitionException {
		expression val = null;


		expression v =null;
		expression v2 =null;
		expression v1 =null;

		try {
			// T.g:27:36: (v= val v2= values_tail |v1= values_tail )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID||(LA3_0 >= Num && LA3_0 <= String)||LA3_0==11||LA3_0==16) ) {
				alt3=1;
			}
			else if ( (LA3_0==12||LA3_0==15) ) {
				alt3=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// T.g:27:38: v= val v2= values_tail
					{
					pushFollow(FOLLOW_val_in_values158);
					v=val();
					state._fsp--;
					if (state.failed) return val;
					pushFollow(FOLLOW_values_tail_in_values162);
					v2=values_tail();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val = h.merge(v,v2);}
					}
					break;
				case 2 :
					// T.g:28:9: v1= values_tail
					{
					pushFollow(FOLLOW_values_tail_in_values179);
					v1=values_tail();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val = v1;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "values"



	// $ANTLR start "values_tail"
	// T.g:31:1: values_tail returns [expression val] : ( ',' v= val v2= values_tail | ')' );
	public final expression values_tail() throws RecognitionException {
		expression val = null;


		expression v =null;
		expression v2 =null;

		try {
			// T.g:31:40: ( ',' v= val v2= values_tail | ')' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==15) ) {
				alt4=1;
			}
			else if ( (LA4_0==12) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// T.g:31:42: ',' v= val v2= values_tail
					{
					match(input,15,FOLLOW_15_in_values_tail205); if (state.failed) return val;
					pushFollow(FOLLOW_val_in_values_tail209);
					v=val();
					state._fsp--;
					if (state.failed) return val;
					pushFollow(FOLLOW_values_tail_in_values_tail213);
					v2=values_tail();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val = h.merge(v,v2);}
					}
					break;
				case 2 :
					// T.g:32:9: ')'
					{
					match(input,12,FOLLOW_12_in_values_tail227); if (state.failed) return val;
					if ( state.backtracking==0 ) {val = new expression("ClosingParentheses");}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "values_tail"



	// $ANTLR start "val"
	// T.g:35:1: val returns [expression val] : (s= String |I= intt |t= tuple |id= ID );
	public final expression val() throws RecognitionException {
		expression val = null;


		Token s=null;
		Token id=null;
		expression I =null;
		expression t =null;

		try {
			// T.g:35:33: (s= String |I= intt |t= tuple |id= ID )
			int alt5=4;
			switch ( input.LA(1) ) {
			case String:
				{
				alt5=1;
				}
				break;
			case Num:
			case 16:
				{
				alt5=2;
				}
				break;
			case 11:
				{
				alt5=3;
				}
				break;
			case ID:
				{
				alt5=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// T.g:35:35: s= String
					{
					s=(Token)match(input,String,FOLLOW_String_in_val260); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =new expression ((s!=null?s.getText():null));}
					}
					break;
				case 2 :
					// T.g:36:9: I= intt
					{
					pushFollow(FOLLOW_intt_in_val278);
					I=intt();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =I;}
					}
					break;
				case 3 :
					// T.g:37:9: t= tuple
					{
					pushFollow(FOLLOW_tuple_in_val296);
					t=tuple();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =t;}
					}
					break;
				case 4 :
					// T.g:38:9: id= ID
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_val314); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.getVal((id!=null?id.getText():null));}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "val"



	// $ANTLR start "add"
	// T.g:41:1: add returns [expression val] : (a1= addint |a2= addstring |a3= addid |a4= addtuple |a5= addslice );
	public final expression add() throws RecognitionException {
		expression val = null;


		expression a1 =null;
		String a2 =null;
		expression a3 =null;
		expression a4 =null;
		expression a5 =null;

		try {
			// T.g:41:33: (a1= addint |a2= addstring |a3= addid |a4= addtuple |a5= addslice )
			int alt6=5;
			switch ( input.LA(1) ) {
			case Num:
			case 16:
				{
				alt6=1;
				}
				break;
			case String:
				{
				alt6=2;
				}
				break;
			case ID:
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3==EOF||LA6_3==ID||LA6_3==11||LA6_3==14||LA6_3==26) ) {
					alt6=3;
				}
				else if ( ((LA6_3 >= 21 && LA6_3 <= 24)) ) {
					alt6=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 11:
				{
				alt6=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// T.g:41:35: a1= addint
					{
					pushFollow(FOLLOW_addint_in_add344);
					a1=addint();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =a1;}
					}
					break;
				case 2 :
					// T.g:42:9: a2= addstring
					{
					pushFollow(FOLLOW_addstring_in_add361);
					a2=addstring();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =new expression(a2);}
					}
					break;
				case 3 :
					// T.g:43:9: a3= addid
					{
					pushFollow(FOLLOW_addid_in_add378);
					a3=addid();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =a3;}
					}
					break;
				case 4 :
					// T.g:44:9: a4= addtuple
					{
					pushFollow(FOLLOW_addtuple_in_add395);
					a4=addtuple();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =a4;}
					}
					break;
				case 5 :
					// T.g:45:9: a5= addslice
					{
					pushFollow(FOLLOW_addslice_in_add412);
					a5=addslice();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =a5;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "add"



	// $ANTLR start "addint"
	// T.g:48:1: addint returns [expression val] : (i1= intt '+' a= add |i2= intt );
	public final expression addint() throws RecognitionException {
		expression val = null;


		expression i1 =null;
		expression a =null;
		expression i2 =null;

		try {
			// T.g:48:35: (i1= intt '+' a= add |i2= intt )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Num) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==14) ) {
					alt7=1;
				}
				else if ( (LA7_1==EOF||LA7_1==ID||LA7_1==11||LA7_1==26) ) {
					alt7=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA7_0==16) ) {
				int LA7_2 = input.LA(2);
				if ( (LA7_2==Num) ) {
					int LA7_5 = input.LA(3);
					if ( (LA7_5==14) ) {
						alt7=1;
					}
					else if ( (LA7_5==EOF||LA7_5==ID||LA7_5==11||LA7_5==26) ) {
						alt7=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// T.g:48:37: i1= intt '+' a= add
					{
					pushFollow(FOLLOW_intt_in_addint440);
					i1=intt();
					state._fsp--;
					if (state.failed) return val;
					match(input,14,FOLLOW_14_in_addint442); if (state.failed) return val;
					pushFollow(FOLLOW_add_in_addint446);
					a=add();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.addint(i1,a);}
					}
					break;
				case 2 :
					// T.g:49:9: i2= intt
					{
					pushFollow(FOLLOW_intt_in_addint462);
					i2=intt();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =i2;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "addint"



	// $ANTLR start "addstring"
	// T.g:52:1: addstring returns [String val] : (s1= String '+' a= addstring |s2= String );
	public final String addstring() throws RecognitionException {
		String val = null;


		Token s1=null;
		Token s2=null;
		String a =null;

		try {
			// T.g:52:33: (s1= String '+' a= addstring |s2= String )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==String) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==14) ) {
					alt8=1;
				}
				else if ( (LA8_1==EOF||LA8_1==ID||LA8_1==11||LA8_1==26) ) {
					alt8=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// T.g:52:35: s1= String '+' a= addstring
					{
					s1=(Token)match(input,String,FOLLOW_String_in_addstring489); if (state.failed) return val;
					match(input,14,FOLLOW_14_in_addstring491); if (state.failed) return val;
					pushFollow(FOLLOW_addstring_in_addstring495);
					a=addstring();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.addstring((s1!=null?s1.getText():null),a);}
					}
					break;
				case 2 :
					// T.g:53:9: s2= String
					{
					s2=(Token)match(input,String,FOLLOW_String_in_addstring510); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =(s2!=null?s2.getText():null);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "addstring"



	// $ANTLR start "addtuple"
	// T.g:56:1: addtuple returns [expression val] : (t1= tuple '+' a= add |t2= tuple );
	public final expression addtuple() throws RecognitionException {
		expression val = null;


		expression t1 =null;
		expression a =null;
		expression t2 =null;

		try {
			// T.g:56:37: (t1= tuple '+' a= add |t2= tuple )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==11) ) {
				int LA9_1 = input.LA(2);
				if ( (synpred15_T()) ) {
					alt9=1;
				}
				else if ( (true) ) {
					alt9=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// T.g:56:39: t1= tuple '+' a= add
					{
					pushFollow(FOLLOW_tuple_in_addtuple538);
					t1=tuple();
					state._fsp--;
					if (state.failed) return val;
					match(input,14,FOLLOW_14_in_addtuple540); if (state.failed) return val;
					pushFollow(FOLLOW_add_in_addtuple544);
					a=add();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.addtuple(t1,a);}
					}
					break;
				case 2 :
					// T.g:57:9: t2= tuple
					{
					pushFollow(FOLLOW_tuple_in_addtuple560);
					t2=tuple();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =t2;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "addtuple"



	// $ANTLR start "addid"
	// T.g:60:1: addid returns [expression val] : (n1= ID '+' a= add |n2= ID );
	public final expression addid() throws RecognitionException {
		expression val = null;


		Token n1=null;
		Token n2=null;
		expression a =null;

		try {
			// T.g:60:35: (n1= ID '+' a= add |n2= ID )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==14) ) {
					alt10=1;
				}
				else if ( (LA10_1==EOF||LA10_1==ID||LA10_1==11||LA10_1==26) ) {
					alt10=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// T.g:60:37: n1= ID '+' a= add
					{
					n1=(Token)match(input,ID,FOLLOW_ID_in_addid589); if (state.failed) return val;
					match(input,14,FOLLOW_14_in_addid591); if (state.failed) return val;
					pushFollow(FOLLOW_add_in_addid595);
					a=add();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.add((n1!=null?n1.getText():null),a);}
					}
					break;
				case 2 :
					// T.g:61:9: n2= ID
					{
					n2=(Token)match(input,ID,FOLLOW_ID_in_addid611); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.getVal((n2!=null?n2.getText():null));}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "addid"



	// $ANTLR start "addslice"
	// T.g:64:1: addslice returns [expression val] : (s1= slice '+' a= add |s2= slice );
	public final expression addslice() throws RecognitionException {
		expression val = null;


		expression s1 =null;
		expression a =null;
		expression s2 =null;

		try {
			// T.g:64:37: (s1= slice '+' a= add |s2= slice )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ID) ) {
				switch ( input.LA(2) ) {
				case 21:
					{
					int LA11_2 = input.LA(3);
					if ( (LA11_2==Num) ) {
						switch ( input.LA(4) ) {
						case 25:
							{
							int LA11_10 = input.LA(5);
							if ( (LA11_10==14) ) {
								alt11=1;
							}
							else if ( (LA11_10==EOF||LA11_10==ID||LA11_10==11||LA11_10==26) ) {
								alt11=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 17:
							{
							int LA11_11 = input.LA(5);
							if ( (LA11_11==Num) ) {
								int LA11_22 = input.LA(6);
								if ( (LA11_22==25) ) {
									int LA11_26 = input.LA(7);
									if ( (LA11_26==14) ) {
										alt11=1;
									}
									else if ( (LA11_26==EOF||LA11_26==ID||LA11_26==11||LA11_26==26) ) {
										alt11=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return val;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 11, 26, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return val;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 11, 22, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 19:
							{
							int LA11_12 = input.LA(5);
							if ( (LA11_12==14) ) {
								alt11=1;
							}
							else if ( (LA11_12==EOF||LA11_12==ID||LA11_12==11||LA11_12==26) ) {
								alt11=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 18:
							{
							int LA11_13 = input.LA(5);
							if ( (LA11_13==Num) ) {
								int LA11_23 = input.LA(6);
								if ( (LA11_23==25) ) {
									int LA11_27 = input.LA(7);
									if ( (LA11_27==14) ) {
										alt11=1;
									}
									else if ( (LA11_27==EOF||LA11_27==ID||LA11_27==11||LA11_27==26) ) {
										alt11=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return val;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 11, 27, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return val;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 11, 23, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 13, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return val;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 23:
					{
					int LA11_3 = input.LA(3);
					if ( (LA11_3==Num) ) {
						int LA11_7 = input.LA(4);
						if ( (LA11_7==25) ) {
							int LA11_14 = input.LA(5);
							if ( (LA11_14==14) ) {
								alt11=1;
							}
							else if ( (LA11_14==EOF||LA11_14==ID||LA11_14==11||LA11_14==26) ) {
								alt11=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 14, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return val;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 22:
					{
					int LA11_4 = input.LA(3);
					if ( (LA11_4==Num) ) {
						switch ( input.LA(4) ) {
						case 25:
							{
							int LA11_15 = input.LA(5);
							if ( (LA11_15==14) ) {
								alt11=1;
							}
							else if ( (LA11_15==EOF||LA11_15==ID||LA11_15==11||LA11_15==26) ) {
								alt11=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 15, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 17:
							{
							int LA11_16 = input.LA(5);
							if ( (LA11_16==Num) ) {
								int LA11_24 = input.LA(6);
								if ( (LA11_24==25) ) {
									int LA11_28 = input.LA(7);
									if ( (LA11_28==14) ) {
										alt11=1;
									}
									else if ( (LA11_28==EOF||LA11_28==ID||LA11_28==11||LA11_28==26) ) {
										alt11=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return val;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 11, 28, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return val;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 11, 24, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 19:
							{
							int LA11_17 = input.LA(5);
							if ( (LA11_17==14) ) {
								alt11=1;
							}
							else if ( (LA11_17==EOF||LA11_17==ID||LA11_17==11||LA11_17==26) ) {
								alt11=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 17, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						case 18:
							{
							int LA11_18 = input.LA(5);
							if ( (LA11_18==Num) ) {
								int LA11_25 = input.LA(6);
								if ( (LA11_25==25) ) {
									int LA11_29 = input.LA(7);
									if ( (LA11_29==14) ) {
										alt11=1;
									}
									else if ( (LA11_29==EOF||LA11_29==ID||LA11_29==11||LA11_29==26) ) {
										alt11=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return val;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 11, 29, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return val;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 11, 25, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 18, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return val;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 24:
					{
					int LA11_5 = input.LA(3);
					if ( (LA11_5==Num) ) {
						int LA11_9 = input.LA(4);
						if ( (LA11_9==25) ) {
							int LA11_19 = input.LA(5);
							if ( (LA11_19==14) ) {
								alt11=1;
							}
							else if ( (LA11_19==EOF||LA11_19==ID||LA11_19==11||LA11_19==26) ) {
								alt11=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return val;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 19, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return val;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// T.g:64:39: s1= slice '+' a= add
					{
					pushFollow(FOLLOW_slice_in_addslice641);
					s1=slice();
					state._fsp--;
					if (state.failed) return val;
					match(input,14,FOLLOW_14_in_addslice643); if (state.failed) return val;
					pushFollow(FOLLOW_add_in_addslice647);
					a=add();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.addtuple(s1,a);}
					}
					break;
				case 2 :
					// T.g:65:9: s2= slice
					{
					pushFollow(FOLLOW_slice_in_addslice663);
					s2=slice();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =s2;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "addslice"



	// $ANTLR start "print"
	// T.g:68:1: print : 'print' '(' n= toprint ;
	public final void print() throws RecognitionException {
		String n =null;

		try {
			// T.g:68:12: ( 'print' '(' n= toprint )
			// T.g:68:14: 'print' '(' n= toprint
			{
			match(input,26,FOLLOW_26_in_print688); if (state.failed) return;
			match(input,11,FOLLOW_11_in_print689); if (state.failed) return;
			pushFollow(FOLLOW_toprint_in_print693);
			n=toprint();
			state._fsp--;
			if (state.failed) return;
			if ( state.backtracking==0 ) {System.out.println(n);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "print"



	// $ANTLR start "toprint"
	// T.g:71:1: toprint returns [String val] : (v1= toprintval v2= toprintval_tail |v3= toprintval_tail );
	public final String toprint() throws RecognitionException {
		String val = null;


		String v1 =null;
		String v2 =null;
		String v3 =null;

		try {
			// T.g:71:32: (v1= toprintval v2= toprintval_tail |v3= toprintval_tail )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ID||(LA12_0 >= Num && LA12_0 <= String)||LA12_0==11||LA12_0==16) ) {
				alt12=1;
			}
			else if ( (LA12_0==12||LA12_0==15) ) {
				alt12=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// T.g:71:34: v1= toprintval v2= toprintval_tail
					{
					pushFollow(FOLLOW_toprintval_in_toprint721);
					v1=toprintval();
					state._fsp--;
					if (state.failed) return val;
					pushFollow(FOLLOW_toprintval_tail_in_toprint725);
					v2=toprintval_tail();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =v1+v2;}
					}
					break;
				case 2 :
					// T.g:72:9: v3= toprintval_tail
					{
					pushFollow(FOLLOW_toprintval_tail_in_toprint739);
					v3=toprintval_tail();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =v3;}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "toprint"



	// $ANTLR start "toprintval_tail"
	// T.g:75:1: toprintval_tail returns [String val] : ( ',' v1= toprintval v2= toprintval_tail | ')' );
	public final String toprintval_tail() throws RecognitionException {
		String val = null;


		String v1 =null;
		String v2 =null;

		try {
			// T.g:75:39: ( ',' v1= toprintval v2= toprintval_tail | ')' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==15) ) {
				alt13=1;
			}
			else if ( (LA13_0==12) ) {
				alt13=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// T.g:75:41: ',' v1= toprintval v2= toprintval_tail
					{
					match(input,15,FOLLOW_15_in_toprintval_tail763); if (state.failed) return val;
					pushFollow(FOLLOW_toprintval_in_toprintval_tail767);
					v1=toprintval();
					state._fsp--;
					if (state.failed) return val;
					pushFollow(FOLLOW_toprintval_tail_in_toprintval_tail771);
					v2=toprintval_tail();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =" "+v1+v2;}
					}
					break;
				case 2 :
					// T.g:76:9: ')'
					{
					match(input,12,FOLLOW_12_in_toprintval_tail783); if (state.failed) return val;
					if ( state.backtracking==0 ) {val ="";}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "toprintval_tail"



	// $ANTLR start "toprintval"
	// T.g:79:1: toprintval returns [String val] : (s= String |I= intt |t= tuple |id= ID |sl= slice );
	public final String toprintval() throws RecognitionException {
		String val = null;


		Token s=null;
		Token id=null;
		expression I =null;
		expression t =null;
		expression sl =null;

		try {
			// T.g:79:34: (s= String |I= intt |t= tuple |id= ID |sl= slice )
			int alt14=5;
			switch ( input.LA(1) ) {
			case String:
				{
				alt14=1;
				}
				break;
			case Num:
			case 16:
				{
				alt14=2;
				}
				break;
			case 11:
				{
				alt14=3;
				}
				break;
			case ID:
				{
				int LA14_4 = input.LA(2);
				if ( ((LA14_4 >= 21 && LA14_4 <= 24)) ) {
					alt14=5;
				}
				else if ( (LA14_4==12||LA14_4==15) ) {
					alt14=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// T.g:79:36: s= String
					{
					s=(Token)match(input,String,FOLLOW_String_in_toprintval811); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.PrintString((s!=null?s.getText():null));}
					}
					break;
				case 2 :
					// T.g:80:9: I= intt
					{
					pushFollow(FOLLOW_intt_in_toprintval828);
					I=intt();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.Printexpression(I);}
					}
					break;
				case 3 :
					// T.g:81:9: t= tuple
					{
					pushFollow(FOLLOW_tuple_in_toprintval846);
					t=tuple();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.Printexpression(t);}
					}
					break;
				case 4 :
					// T.g:82:9: id= ID
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_toprintval863); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.PrintFormat((id!=null?id.getText():null));}
					}
					break;
				case 5 :
					// T.g:83:9: sl= slice
					{
					pushFollow(FOLLOW_slice_in_toprintval881);
					sl=slice();
					state._fsp--;
					if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.PrintSlice(sl);}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "toprintval"



	// $ANTLR start "unpack"
	// T.g:86:1: unpack : '(' d= ids ')=' n= ID ;
	public final void unpack() throws RecognitionException {
		Token n=null;
		List<String> d =null;

		try {
			// T.g:86:14: ( '(' d= ids ')=' n= ID )
			// T.g:86:16: '(' d= ids ')=' n= ID
			{
			match(input,11,FOLLOW_11_in_unpack907); if (state.failed) return;
			pushFollow(FOLLOW_ids_in_unpack911);
			d=ids();
			state._fsp--;
			if (state.failed) return;
			match(input,13,FOLLOW_13_in_unpack913); if (state.failed) return;
			n=(Token)match(input,ID,FOLLOW_ID_in_unpack917); if (state.failed) return;
			if ( state.backtracking==0 ) {h.unpacking(d,(n!=null?n.getText():null));}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unpack"



	// $ANTLR start "ids"
	// T.g:89:1: ids returns [List<String> vals] : (n= ID ',' id1= ids |n1= ID );
	public final List<String> ids() throws RecognitionException {
		List<String> vals = null;


		Token n=null;
		Token n1=null;
		List<String> id1 =null;

		try {
			// T.g:89:35: (n= ID ',' id1= ids |n1= ID )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				int LA15_1 = input.LA(2);
				if ( (LA15_1==15) ) {
					alt15=1;
				}
				else if ( (LA15_1==EOF||LA15_1==13) ) {
					alt15=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return vals;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 15, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return vals;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// T.g:89:37: n= ID ',' id1= ids
					{
					n=(Token)match(input,ID,FOLLOW_ID_in_ids945); if (state.failed) return vals;
					match(input,15,FOLLOW_15_in_ids947); if (state.failed) return vals;
					pushFollow(FOLLOW_ids_in_ids951);
					id1=ids();
					state._fsp--;
					if (state.failed) return vals;
					if ( state.backtracking==0 ) {vals = h.addids((n!=null?n.getText():null), id1);}
					}
					break;
				case 2 :
					// T.g:90:9: n1= ID
					{
					n1=(Token)match(input,ID,FOLLOW_ID_in_ids968); if (state.failed) return vals;
					if ( state.backtracking==0 ) {vals = h.addids((n1!=null?n1.getText():null));}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return vals;
	}
	// $ANTLR end "ids"



	// $ANTLR start "intt"
	// T.g:93:1: intt returns [expression val] : (n= Num | '-' n= Num );
	public final expression intt() throws RecognitionException {
		expression val = null;


		Token n=null;

		try {
			// T.g:93:34: (n= Num | '-' n= Num )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Num) ) {
				alt16=1;
			}
			else if ( (LA16_0==16) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// T.g:93:36: n= Num
					{
					n=(Token)match(input,Num,FOLLOW_Num_in_intt1000); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =new expression((n!=null?Integer.valueOf(n.getText()):0));}
					}
					break;
				case 2 :
					// T.g:94:9: '-' n= Num
					{
					match(input,16,FOLLOW_16_in_intt1016); if (state.failed) return val;
					n=(Token)match(input,Num,FOLLOW_Num_in_intt1019); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =new expression(-(n!=null?Integer.valueOf(n.getText()):0));}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "intt"



	// $ANTLR start "tuple"
	// T.g:97:1: tuple returns [expression val] : '(' v= values ;
	public final expression tuple() throws RecognitionException {
		expression val = null;


		expression v =null;

		try {
			// T.g:97:34: ( '(' v= values )
			// T.g:97:36: '(' v= values
			{
			match(input,11,FOLLOW_11_in_tuple1045); if (state.failed) return val;
			pushFollow(FOLLOW_values_in_tuple1049);
			v=values();
			state._fsp--;
			if (state.failed) return val;
			if ( state.backtracking==0 ) {val =h.ToTuple(v);}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "tuple"



	// $ANTLR start "slice"
	// T.g:100:1: slice returns [expression val] : (d= ID '[' n= Num ']' |d1= ID '[' n1= Num ':' n2= Num ']' |d2= ID '[:' n= Num ']' |d3= ID '[' n= Num ':]' |d4= ID '[-' n= Num ']' |d5= ID '[-' n1= Num ':' n2= Num ']' |d6= ID '[:-' n= Num ']' |d7= ID '[-' n= Num ':]' |d8= ID '[-' n1= Num ':-' n2= Num ']' |d9= ID '[' n1= Num ':-' n2= Num ']' );
	public final expression slice() throws RecognitionException {
		expression val = null;


		Token d=null;
		Token n=null;
		Token d1=null;
		Token n1=null;
		Token n2=null;
		Token d2=null;
		Token d3=null;
		Token d4=null;
		Token d5=null;
		Token d6=null;
		Token d7=null;
		Token d8=null;
		Token d9=null;

		try {
			// T.g:100:35: (d= ID '[' n= Num ']' |d1= ID '[' n1= Num ':' n2= Num ']' |d2= ID '[:' n= Num ']' |d3= ID '[' n= Num ':]' |d4= ID '[-' n= Num ']' |d5= ID '[-' n1= Num ':' n2= Num ']' |d6= ID '[:-' n= Num ']' |d7= ID '[-' n= Num ':]' |d8= ID '[-' n1= Num ':-' n2= Num ']' |d9= ID '[' n1= Num ':-' n2= Num ']' )
			int alt17=10;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ID) ) {
				switch ( input.LA(2) ) {
				case 21:
					{
					int LA17_2 = input.LA(3);
					if ( (LA17_2==Num) ) {
						switch ( input.LA(4) ) {
						case 25:
							{
							alt17=1;
							}
							break;
						case 17:
							{
							alt17=2;
							}
							break;
						case 19:
							{
							alt17=4;
							}
							break;
						case 18:
							{
							alt17=10;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return val;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 23:
					{
					alt17=3;
					}
					break;
				case 22:
					{
					int LA17_4 = input.LA(3);
					if ( (LA17_4==Num) ) {
						switch ( input.LA(4) ) {
						case 25:
							{
							alt17=5;
							}
							break;
						case 17:
							{
							alt17=6;
							}
							break;
						case 19:
							{
							alt17=8;
							}
							break;
						case 18:
							{
							alt17=9;
							}
							break;
						default:
							if (state.backtracking>0) {state.failed=true; return val;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 17, 7, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}

					else {
						if (state.backtracking>0) {state.failed=true; return val;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 17, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 24:
					{
					alt17=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return val;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 17, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return val;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// T.g:100:37: d= ID '[' n= Num ']'
					{
					d=(Token)match(input,ID,FOLLOW_ID_in_slice1079); if (state.failed) return val;
					match(input,21,FOLLOW_21_in_slice1082); if (state.failed) return val;
					n=(Token)match(input,Num,FOLLOW_Num_in_slice1086); if (state.failed) return val;
					match(input,25,FOLLOW_25_in_slice1088); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d!=null?d.getText():null),(n!=null?Integer.valueOf(n.getText()):0));}
					}
					break;
				case 2 :
					// T.g:101:9: d1= ID '[' n1= Num ':' n2= Num ']'
					{
					d1=(Token)match(input,ID,FOLLOW_ID_in_slice1105); if (state.failed) return val;
					match(input,21,FOLLOW_21_in_slice1107); if (state.failed) return val;
					n1=(Token)match(input,Num,FOLLOW_Num_in_slice1111); if (state.failed) return val;
					match(input,17,FOLLOW_17_in_slice1113); if (state.failed) return val;
					n2=(Token)match(input,Num,FOLLOW_Num_in_slice1117); if (state.failed) return val;
					match(input,25,FOLLOW_25_in_slice1119); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d1!=null?d1.getText():null),(n1!=null?Integer.valueOf(n1.getText()):0),(n2!=null?Integer.valueOf(n2.getText()):0));}
					}
					break;
				case 3 :
					// T.g:102:9: d2= ID '[:' n= Num ']'
					{
					d2=(Token)match(input,ID,FOLLOW_ID_in_slice1134); if (state.failed) return val;
					match(input,23,FOLLOW_23_in_slice1136); if (state.failed) return val;
					n=(Token)match(input,Num,FOLLOW_Num_in_slice1140); if (state.failed) return val;
					match(input,25,FOLLOW_25_in_slice1142); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d2!=null?d2.getText():null),0,(n!=null?Integer.valueOf(n.getText()):0));}
					}
					break;
				case 4 :
					// T.g:103:9: d3= ID '[' n= Num ':]'
					{
					d3=(Token)match(input,ID,FOLLOW_ID_in_slice1159); if (state.failed) return val;
					match(input,21,FOLLOW_21_in_slice1161); if (state.failed) return val;
					n=(Token)match(input,Num,FOLLOW_Num_in_slice1165); if (state.failed) return val;
					match(input,19,FOLLOW_19_in_slice1167); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d3!=null?d3.getText():null),(n!=null?Integer.valueOf(n.getText()):0),-1);}
					}
					break;
				case 5 :
					// T.g:104:9: d4= ID '[-' n= Num ']'
					{
					d4=(Token)match(input,ID,FOLLOW_ID_in_slice1184); if (state.failed) return val;
					match(input,22,FOLLOW_22_in_slice1187); if (state.failed) return val;
					n=(Token)match(input,Num,FOLLOW_Num_in_slice1191); if (state.failed) return val;
					match(input,25,FOLLOW_25_in_slice1193); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d4!=null?d4.getText():null),h.negative((n!=null?Integer.valueOf(n.getText()):0)));}
					}
					break;
				case 6 :
					// T.g:105:9: d5= ID '[-' n1= Num ':' n2= Num ']'
					{
					d5=(Token)match(input,ID,FOLLOW_ID_in_slice1210); if (state.failed) return val;
					match(input,22,FOLLOW_22_in_slice1212); if (state.failed) return val;
					n1=(Token)match(input,Num,FOLLOW_Num_in_slice1216); if (state.failed) return val;
					match(input,17,FOLLOW_17_in_slice1218); if (state.failed) return val;
					n2=(Token)match(input,Num,FOLLOW_Num_in_slice1222); if (state.failed) return val;
					match(input,25,FOLLOW_25_in_slice1224); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d5!=null?d5.getText():null),h.negative((n1!=null?Integer.valueOf(n1.getText()):0)),(n2!=null?Integer.valueOf(n2.getText()):0));}
					}
					break;
				case 7 :
					// T.g:106:9: d6= ID '[:-' n= Num ']'
					{
					d6=(Token)match(input,ID,FOLLOW_ID_in_slice1239); if (state.failed) return val;
					match(input,24,FOLLOW_24_in_slice1241); if (state.failed) return val;
					n=(Token)match(input,Num,FOLLOW_Num_in_slice1245); if (state.failed) return val;
					match(input,25,FOLLOW_25_in_slice1247); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d6!=null?d6.getText():null),0,h.negative((n!=null?Integer.valueOf(n.getText()):0)));}
					}
					break;
				case 8 :
					// T.g:107:9: d7= ID '[-' n= Num ':]'
					{
					d7=(Token)match(input,ID,FOLLOW_ID_in_slice1264); if (state.failed) return val;
					match(input,22,FOLLOW_22_in_slice1266); if (state.failed) return val;
					n=(Token)match(input,Num,FOLLOW_Num_in_slice1270); if (state.failed) return val;
					match(input,19,FOLLOW_19_in_slice1272); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d7!=null?d7.getText():null),h.negative((n!=null?Integer.valueOf(n.getText()):0)),-1);}
					}
					break;
				case 9 :
					// T.g:108:9: d8= ID '[-' n1= Num ':-' n2= Num ']'
					{
					d8=(Token)match(input,ID,FOLLOW_ID_in_slice1289); if (state.failed) return val;
					match(input,22,FOLLOW_22_in_slice1291); if (state.failed) return val;
					n1=(Token)match(input,Num,FOLLOW_Num_in_slice1295); if (state.failed) return val;
					match(input,18,FOLLOW_18_in_slice1297); if (state.failed) return val;
					n2=(Token)match(input,Num,FOLLOW_Num_in_slice1301); if (state.failed) return val;
					match(input,25,FOLLOW_25_in_slice1303); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d8!=null?d8.getText():null),h.negative((n1!=null?Integer.valueOf(n1.getText()):0)),h.negative((n2!=null?Integer.valueOf(n2.getText()):0)));}
					}
					break;
				case 10 :
					// T.g:109:9: d9= ID '[' n1= Num ':-' n2= Num ']'
					{
					d9=(Token)match(input,ID,FOLLOW_ID_in_slice1318); if (state.failed) return val;
					match(input,21,FOLLOW_21_in_slice1320); if (state.failed) return val;
					n1=(Token)match(input,Num,FOLLOW_Num_in_slice1324); if (state.failed) return val;
					match(input,18,FOLLOW_18_in_slice1326); if (state.failed) return val;
					n2=(Token)match(input,Num,FOLLOW_Num_in_slice1330); if (state.failed) return val;
					match(input,25,FOLLOW_25_in_slice1332); if (state.failed) return val;
					if ( state.backtracking==0 ) {val =h.slice((d9!=null?d9.getText():null),(n1!=null?Integer.valueOf(n1.getText()):0),h.negative((n2!=null?Integer.valueOf(n2.getText()):0)));}
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "slice"

	// $ANTLR start synpred15_T
	public final void synpred15_T_fragment() throws RecognitionException {
		expression t1 =null;
		expression a =null;

		// T.g:56:39: (t1= tuple '+' a= add )
		// T.g:56:39: t1= tuple '+' a= add
		{
		pushFollow(FOLLOW_tuple_in_synpred15_T538);
		t1=tuple();
		state._fsp--;
		if (state.failed) return;
		match(input,14,FOLLOW_14_in_synpred15_T540); if (state.failed) return;
		pushFollow(FOLLOW_add_in_synpred15_T544);
		a=add();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred15_T

	// Delegated rules

	public final boolean synpred15_T() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_T_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_stmt_in_prog41 = new BitSet(new long[]{0x0000000004000842L});
	public static final BitSet FOLLOW_assign_in_stmt69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_print_in_stmt83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unpack_in_stmt98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assign122 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assign124 = new BitSet(new long[]{0x0000000000010B40L});
	public static final BitSet FOLLOW_add_in_assign128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_val_in_values158 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_values_tail_in_values162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_values_tail_in_values179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_values_tail205 = new BitSet(new long[]{0x0000000000010B40L});
	public static final BitSet FOLLOW_val_in_values_tail209 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_values_tail_in_values_tail213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_values_tail227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_val260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intt_in_val278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_val296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_val314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addint_in_add344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addstring_in_add361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addid_in_add378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addtuple_in_add395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_addslice_in_add412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intt_in_addint440 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_addint442 = new BitSet(new long[]{0x0000000000010B40L});
	public static final BitSet FOLLOW_add_in_addint446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intt_in_addint462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_addstring489 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_addstring491 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_addstring_in_addstring495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_addstring510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_addtuple538 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_addtuple540 = new BitSet(new long[]{0x0000000000010B40L});
	public static final BitSet FOLLOW_add_in_addtuple544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_addtuple560 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addid589 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_addid591 = new BitSet(new long[]{0x0000000000010B40L});
	public static final BitSet FOLLOW_add_in_addid595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_addid611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_slice_in_addslice641 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_addslice643 = new BitSet(new long[]{0x0000000000010B40L});
	public static final BitSet FOLLOW_add_in_addslice647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_slice_in_addslice663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_print688 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_print689 = new BitSet(new long[]{0x0000000000019B40L});
	public static final BitSet FOLLOW_toprint_in_print693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_toprintval_in_toprint721 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_toprintval_tail_in_toprint725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_toprintval_tail_in_toprint739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_toprintval_tail763 = new BitSet(new long[]{0x0000000000010B40L});
	public static final BitSet FOLLOW_toprintval_in_toprintval_tail767 = new BitSet(new long[]{0x0000000000009000L});
	public static final BitSet FOLLOW_toprintval_tail_in_toprintval_tail771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_toprintval_tail783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_toprintval811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intt_in_toprintval828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_toprintval846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_toprintval863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_slice_in_toprintval881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_unpack907 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ids_in_unpack911 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_unpack913 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_unpack917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ids945 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_ids947 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ids_in_ids951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ids968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Num_in_intt1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_intt1016 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_intt1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_tuple1045 = new BitSet(new long[]{0x0000000000019B40L});
	public static final BitSet FOLLOW_values_in_tuple1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1079 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_slice1082 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1086 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_slice1088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1105 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_slice1107 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1111 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_slice1113 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1117 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_slice1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1134 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_slice1136 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1140 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_slice1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1159 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_slice1161 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1165 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_slice1167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1184 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_slice1187 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1191 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_slice1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1210 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_slice1212 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1216 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_slice1218 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1222 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_slice1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1239 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_slice1241 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1245 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_slice1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1264 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_slice1266 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1270 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_slice1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1289 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_slice1291 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1295 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_slice1297 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1301 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_slice1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_slice1318 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_slice1320 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1324 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_slice1326 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Num_in_slice1330 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_slice1332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tuple_in_synpred15_T538 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_synpred15_T540 = new BitSet(new long[]{0x0000000000010B40L});
	public static final BitSet FOLLOW_add_in_synpred15_T544 = new BitSet(new long[]{0x0000000000000002L});
}
