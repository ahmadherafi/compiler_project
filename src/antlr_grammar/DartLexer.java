// Generated from java-escape by ANTLR 4.11.1
package antlr_grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DartLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, OPEN_CLASS=2, LIST=3, LIST_NAME=4, OPEN_LIST=5, WS=6, NEWLINE=7, 
		COMMA=8, CLOSE_LIST=9, LIST_INT=10, INTGER=11, INT_NAME=12, EQUAL=13, 
		PLUS=14, VOID=15, SUM=16, OPEN_B=17, COLSE_B=18, FOR=19, SMALLER=20, DOT=21, 
		LENGTH=22, PRINT=23, SMEI=24, I=25, LETTER=26, CLOSE_CLASS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "OPEN_CLASS", "LIST", "LIST_NAME", "OPEN_LIST", "WS", "NEWLINE", 
			"COMMA", "CLOSE_LIST", "LIST_INT", "INTGER", "INT_NAME", "EQUAL", "PLUS", 
			"VOID", "SUM", "OPEN_B", "COLSE_B", "FOR", "SMALLER", "DOT", "LENGTH", 
			"PRINT", "SMEI", "I", "LETTER", "CLOSE_CLASS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'List'", "'number'", "'['", null, null, "','", 
			"']'", null, "'int'", "'sumNumber'", "'='", "'+'", "'void'", "'sum'", 
			"'('", "')'", "'for'", "'<'", "'.'", "'length'", "'print'", "';'", null, 
			null, "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "OPEN_CLASS", "LIST", "LIST_NAME", "OPEN_LIST", "WS", 
			"NEWLINE", "COMMA", "CLOSE_LIST", "LIST_INT", "INTGER", "INT_NAME", "EQUAL", 
			"PLUS", "VOID", "SUM", "OPEN_B", "COLSE_B", "FOR", "SMALLER", "DOT", 
			"LENGTH", "PRINT", "SMEI", "I", "LETTER", "CLOSE_CLASS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public DartLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DartLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001b\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005"+
		"O\b\u0005\u000b\u0005\f\u0005P\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0004\t^\b\t\u000b\t\f\t_\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0004\u0018\u0099\b\u0018\u000b\u0018\f\u0018\u009a\u0001"+
		"\u0018\u0003\u0018\u009e\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b\u0001\u0000\u0004"+
		"\u0002\u0000\t\t  \u0002\u0000\n\n\r\r\u0001\u000009\u0002\u0000AZaz\u00a6"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000"+
		"\u0003=\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007D"+
		"\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000bN\u0001\u0000"+
		"\u0000\u0000\rT\u0001\u0000\u0000\u0000\u000fX\u0001\u0000\u0000\u0000"+
		"\u0011Z\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015a"+
		"\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019o\u0001\u0000"+
		"\u0000\u0000\u001bq\u0001\u0000\u0000\u0000\u001ds\u0001\u0000\u0000\u0000"+
		"\u001fx\u0001\u0000\u0000\u0000!|\u0001\u0000\u0000\u0000#~\u0001\u0000"+
		"\u0000\u0000%\u0080\u0001\u0000\u0000\u0000\'\u0084\u0001\u0000\u0000"+
		"\u0000)\u0086\u0001\u0000\u0000\u0000+\u0088\u0001\u0000\u0000\u0000-"+
		"\u008f\u0001\u0000\u0000\u0000/\u0095\u0001\u0000\u0000\u00001\u009d\u0001"+
		"\u0000\u0000\u00003\u009f\u0001\u0000\u0000\u00005\u00a1\u0001\u0000\u0000"+
		"\u000078\u0005c\u0000\u000089\u0005l\u0000\u00009:\u0005a\u0000\u0000"+
		":;\u0005s\u0000\u0000;<\u0005s\u0000\u0000<\u0002\u0001\u0000\u0000\u0000"+
		"=>\u0005{\u0000\u0000>\u0004\u0001\u0000\u0000\u0000?@\u0005L\u0000\u0000"+
		"@A\u0005i\u0000\u0000AB\u0005s\u0000\u0000BC\u0005t\u0000\u0000C\u0006"+
		"\u0001\u0000\u0000\u0000DE\u0005n\u0000\u0000EF\u0005u\u0000\u0000FG\u0005"+
		"m\u0000\u0000GH\u0005b\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005r\u0000"+
		"\u0000J\b\u0001\u0000\u0000\u0000KL\u0005[\u0000\u0000L\n\u0001\u0000"+
		"\u0000\u0000MO\u0007\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RS\u0006\u0005\u0000\u0000S\f\u0001\u0000\u0000"+
		"\u0000TU\u0007\u0001\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006\u0006"+
		"\u0001\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0005,\u0000\u0000Y\u0010"+
		"\u0001\u0000\u0000\u0000Z[\u0005]\u0000\u0000[\u0012\u0001\u0000\u0000"+
		"\u0000\\^\u0007\u0002\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0014"+
		"\u0001\u0000\u0000\u0000ab\u0005i\u0000\u0000bc\u0005n\u0000\u0000cd\u0005"+
		"t\u0000\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0005s\u0000\u0000fg\u0005"+
		"u\u0000\u0000gh\u0005m\u0000\u0000hi\u0005N\u0000\u0000ij\u0005u\u0000"+
		"\u0000jk\u0005m\u0000\u0000kl\u0005b\u0000\u0000lm\u0005e\u0000\u0000"+
		"mn\u0005r\u0000\u0000n\u0018\u0001\u0000\u0000\u0000op\u0005=\u0000\u0000"+
		"p\u001a\u0001\u0000\u0000\u0000qr\u0005+\u0000\u0000r\u001c\u0001\u0000"+
		"\u0000\u0000st\u0005v\u0000\u0000tu\u0005o\u0000\u0000uv\u0005i\u0000"+
		"\u0000vw\u0005d\u0000\u0000w\u001e\u0001\u0000\u0000\u0000xy\u0005s\u0000"+
		"\u0000yz\u0005u\u0000\u0000z{\u0005m\u0000\u0000{ \u0001\u0000\u0000\u0000"+
		"|}\u0005(\u0000\u0000}\"\u0001\u0000\u0000\u0000~\u007f\u0005)\u0000\u0000"+
		"\u007f$\u0001\u0000\u0000\u0000\u0080\u0081\u0005f\u0000\u0000\u0081\u0082"+
		"\u0005o\u0000\u0000\u0082\u0083\u0005r\u0000\u0000\u0083&\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005<\u0000\u0000\u0085(\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0005.\u0000\u0000\u0087*\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005l\u0000\u0000\u0089\u008a\u0005e\u0000\u0000\u008a\u008b\u0005n"+
		"\u0000\u0000\u008b\u008c\u0005g\u0000\u0000\u008c\u008d\u0005t\u0000\u0000"+
		"\u008d\u008e\u0005h\u0000\u0000\u008e,\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005p\u0000\u0000\u0090\u0091\u0005r\u0000\u0000\u0091\u0092\u0005i"+
		"\u0000\u0000\u0092\u0093\u0005n\u0000\u0000\u0093\u0094\u0005t\u0000\u0000"+
		"\u0094.\u0001\u0000\u0000\u0000\u0095\u0096\u0005;\u0000\u0000\u00960"+
		"\u0001\u0000\u0000\u0000\u0097\u0099\u0007\u0003\u0000\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u00033\u0019\u0000\u009d\u0098\u0001"+
		"\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e2\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0007\u0003\u0000\u0000\u00a04\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005}\u0000\u0000\u00a26\u0001\u0000\u0000\u0000\u0005"+
		"\u0000P_\u009a\u009d\u0002\u0000\u0001\u0000\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}