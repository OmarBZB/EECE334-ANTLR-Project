// $ANTLR 3.5.2 T.g 2021-05-04 13:16:04

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class TLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public TLexer() {} 
	public TLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public TLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "T.g"; }

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:7:7: ( '(' )
			// T.g:7:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:8:7: ( ')' )
			// T.g:8:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:9:7: ( ')=' )
			// T.g:9:9: ')='
			{
			match(")="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:10:7: ( '+' )
			// T.g:10:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:11:7: ( ',' )
			// T.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:12:7: ( '-' )
			// T.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:13:7: ( ':' )
			// T.g:13:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:14:7: ( ':-' )
			// T.g:14:9: ':-'
			{
			match(":-"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:15:7: ( ':]' )
			// T.g:15:9: ':]'
			{
			match(":]"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:16:7: ( '=' )
			// T.g:16:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:17:7: ( '[' )
			// T.g:17:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:18:7: ( '[-' )
			// T.g:18:9: '[-'
			{
			match("[-"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:19:7: ( '[:' )
			// T.g:19:9: '[:'
			{
			match("[:"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:20:7: ( '[:-' )
			// T.g:20:9: '[:-'
			{
			match("[:-"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:21:7: ( ']' )
			// T.g:21:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:22:7: ( 'print' )
			// T.g:22:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// T.g:114:21: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// T.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// T.g:116:20: ( '0' .. '9' )
			// T.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Num"
	public final void mNum() throws RecognitionException {
		try {
			int _type = Num;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:118:10: ( Digit ( Digit )* )
			// T.g:118:12: Digit ( Digit )*
			{
			mDigit(); 

			// T.g:118:17: ( Digit )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Num"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:120:9: ( Letter ( Letter | Digit | '_' )* )
			// T.g:120:11: Letter ( Letter | Digit | '_' )*
			{
			mLetter(); 

			// T.g:120:17: ( Letter | Digit | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:122:14: ( ( '\"' (~ ( '\"' ) )+ '\"' ) | ( '\\'' (~ ( '\\'' ) )+ '\\'' ) )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='\"') ) {
				alt5=1;
			}
			else if ( (LA5_0=='\'') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// T.g:122:16: ( '\"' (~ ( '\"' ) )+ '\"' )
					{
					// T.g:122:16: ( '\"' (~ ( '\"' ) )+ '\"' )
					// T.g:122:17: '\"' (~ ( '\"' ) )+ '\"'
					{
					match('\"'); 
					// T.g:122:21: (~ ( '\"' ) )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// T.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('\"'); 
					}

					}
					break;
				case 2 :
					// T.g:122:36: ( '\\'' (~ ( '\\'' ) )+ '\\'' )
					{
					// T.g:122:36: ( '\\'' (~ ( '\\'' ) )+ '\\'' )
					// T.g:122:37: '\\'' (~ ( '\\'' ) )+ '\\''
					{
					match('\''); 
					// T.g:122:42: (~ ( '\\'' ) )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '\u0000' && LA4_0 <= '&')||(LA4_0 >= '(' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// T.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match('\''); 
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:124:9: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// T.g:124:11: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// T.g:124:11: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENTS"
	public final void mCOMMENTS() throws RecognitionException {
		try {
			int _type = COMMENTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// T.g:126:15: ( '#' (~ ( '\\n' | '\\r' ) )* )
			// T.g:126:17: '#' (~ ( '\\n' | '\\r' ) )*
			{
			match('#'); 
			// T.g:126:20: (~ ( '\\n' | '\\r' ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// T.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop7;
				}
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENTS"

	@Override
	public void mTokens() throws RecognitionException {
		// T.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | Num | ID | String | WS | COMMENTS )
		int alt8=21;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt8=1;
			}
			break;
		case ')':
			{
			int LA8_2 = input.LA(2);
			if ( (LA8_2=='=') ) {
				alt8=3;
			}

			else {
				alt8=2;
			}

			}
			break;
		case '+':
			{
			alt8=4;
			}
			break;
		case ',':
			{
			alt8=5;
			}
			break;
		case '-':
			{
			alt8=6;
			}
			break;
		case ':':
			{
			switch ( input.LA(2) ) {
			case '-':
				{
				alt8=8;
				}
				break;
			case ']':
				{
				alt8=9;
				}
				break;
			default:
				alt8=7;
			}
			}
			break;
		case '=':
			{
			alt8=10;
			}
			break;
		case '[':
			{
			switch ( input.LA(2) ) {
			case '-':
				{
				alt8=12;
				}
				break;
			case ':':
				{
				int LA8_22 = input.LA(3);
				if ( (LA8_22=='-') ) {
					alt8=14;
				}

				else {
					alt8=13;
				}

				}
				break;
			default:
				alt8=11;
			}
			}
			break;
		case ']':
			{
			alt8=15;
			}
			break;
		case 'p':
			{
			int LA8_10 = input.LA(2);
			if ( (LA8_10=='r') ) {
				int LA8_24 = input.LA(3);
				if ( (LA8_24=='i') ) {
					int LA8_27 = input.LA(4);
					if ( (LA8_27=='n') ) {
						int LA8_28 = input.LA(5);
						if ( (LA8_28=='t') ) {
							int LA8_29 = input.LA(6);
							if ( ((LA8_29 >= '0' && LA8_29 <= '9')||(LA8_29 >= 'A' && LA8_29 <= 'Z')||LA8_29=='_'||(LA8_29 >= 'a' && LA8_29 <= 'z')) ) {
								alt8=18;
							}

							else {
								alt8=16;
							}

						}

						else {
							alt8=18;
						}

					}

					else {
						alt8=18;
					}

				}

				else {
					alt8=18;
				}

			}

			else {
				alt8=18;
			}

			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt8=17;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt8=18;
			}
			break;
		case '\"':
		case '\'':
			{
			alt8=19;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt8=20;
			}
			break;
		case '#':
			{
			alt8=21;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);
			throw nvae;
		}
		switch (alt8) {
			case 1 :
				// T.g:1:10: T__11
				{
				mT__11(); 

				}
				break;
			case 2 :
				// T.g:1:16: T__12
				{
				mT__12(); 

				}
				break;
			case 3 :
				// T.g:1:22: T__13
				{
				mT__13(); 

				}
				break;
			case 4 :
				// T.g:1:28: T__14
				{
				mT__14(); 

				}
				break;
			case 5 :
				// T.g:1:34: T__15
				{
				mT__15(); 

				}
				break;
			case 6 :
				// T.g:1:40: T__16
				{
				mT__16(); 

				}
				break;
			case 7 :
				// T.g:1:46: T__17
				{
				mT__17(); 

				}
				break;
			case 8 :
				// T.g:1:52: T__18
				{
				mT__18(); 

				}
				break;
			case 9 :
				// T.g:1:58: T__19
				{
				mT__19(); 

				}
				break;
			case 10 :
				// T.g:1:64: T__20
				{
				mT__20(); 

				}
				break;
			case 11 :
				// T.g:1:70: T__21
				{
				mT__21(); 

				}
				break;
			case 12 :
				// T.g:1:76: T__22
				{
				mT__22(); 

				}
				break;
			case 13 :
				// T.g:1:82: T__23
				{
				mT__23(); 

				}
				break;
			case 14 :
				// T.g:1:88: T__24
				{
				mT__24(); 

				}
				break;
			case 15 :
				// T.g:1:94: T__25
				{
				mT__25(); 

				}
				break;
			case 16 :
				// T.g:1:100: T__26
				{
				mT__26(); 

				}
				break;
			case 17 :
				// T.g:1:106: Num
				{
				mNum(); 

				}
				break;
			case 18 :
				// T.g:1:110: ID
				{
				mID(); 

				}
				break;
			case 19 :
				// T.g:1:113: String
				{
				mString(); 

				}
				break;
			case 20 :
				// T.g:1:120: WS
				{
				mWS(); 

				}
				break;
			case 21 :
				// T.g:1:123: COMMENTS
				{
				mCOMMENTS(); 

				}
				break;

		}
	}



}
