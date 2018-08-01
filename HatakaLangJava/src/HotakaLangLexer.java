// Generated from HotakaLangLexer.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HotakaLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REAL=1, ENTERO=2, BOOL=3, STRING=4, MUESTRA=5, LEE=6, SUMA=7, RESTA=8, 
		MULT=9, DIV=10, MOD=11, AND=12, OR=13, NOT=14, MAYOR=15, MENOR=16, MAIG=17, 
		MEIG=18, IG=19, NIG=20, IF=21, ELSE=22, SWITCH=23, WHILE=24, FOR=25, ASIGN=26, 
		LLI=27, LLD=28, PI=29, PD=30, PCI=31, PCD=32, COM=33, PIP=34, DP=35, BEGIN=36, 
		END=37, CASE=38, DEFAULT=39, SQRT=40, FIB=41, SEN=42, PRIM=43, POT=44, 
		COS=45, NUM=46, FLOAT=47, SINO=48, STR=49, ID=50, WS=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DIG", "PUNTO", "TRUE", "NOTRUE", "REAL", "ENTERO", "BOOL", "STRING", 
		"MUESTRA", "LEE", "SUMA", "RESTA", "MULT", "DIV", "MOD", "AND", "OR", 
		"NOT", "MAYOR", "MENOR", "MAIG", "MEIG", "IG", "NIG", "IF", "ELSE", "SWITCH", 
		"WHILE", "FOR", "ASIGN", "LLI", "LLD", "PI", "PD", "PCI", "PCD", "COM", 
		"PIP", "DP", "BEGIN", "END", "CASE", "DEFAULT", "SQRT", "FIB", "SEN", 
		"PRIM", "POT", "COS", "NUM", "FLOAT", "SINO", "STR", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'tau'", "'katoa'", "'engari'", "'mekameka'", "'tauira'", "'panui'", 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'a'", "'ranei'", "'kore'", "'>'", 
		"'<'", "'>='", "'<='", "'=='", "'!='", "'ae'", "'aee'", "'huringa'", "'ahakoa'", 
		"'mo'", "'='", "'{'", "'}'", "'('", "')'", "'['", "']'", "'\"'", "'|'", 
		"':'", "'home'", "'mutunga'", null, "'mate'", "'pakiaka'", "'fiboo'", 
		"'pokapu'", "'teina'", "'mana'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "REAL", "ENTERO", "BOOL", "STRING", "MUESTRA", "LEE", "SUMA", "RESTA", 
		"MULT", "DIV", "MOD", "AND", "OR", "NOT", "MAYOR", "MENOR", "MAIG", "MEIG", 
		"IG", "NIG", "IF", "ELSE", "SWITCH", "WHILE", "FOR", "ASIGN", "LLI", "LLD", 
		"PI", "PD", "PCI", "PCD", "COM", "PIP", "DP", "BEGIN", "END", "CASE", 
		"DEFAULT", "SQRT", "FIB", "SEN", "PRIM", "POT", "COS", "NUM", "FLOAT", 
		"SINO", "STR", "ID", "WS"
	};
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


	public HotakaLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HotakaLangLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0164\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u013e\n\63\r\63\16"+
		"\63\u013f\3\64\3\64\3\64\3\64\3\65\3\65\5\65\u0148\n\65\3\66\3\66\7\66"+
		"\u014c\n\66\f\66\16\66\u014f\13\66\3\66\3\66\3\67\6\67\u0154\n\67\r\67"+
		"\16\67\u0155\3\67\7\67\u0159\n\67\f\67\16\67\u015c\13\67\38\68\u015f\n"+
		"8\r8\168\u0160\38\38\3\u014d\29\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23"+
		"\7\25\b\27\t\31\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61"+
		"\26\63\27\65\30\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)Y*"+
		"[+],_-a.c/e\60g\61i\62k\63m\64o\65\3\2\6\3\2\62;\4\2C\\c|\6\2//\62;C\\"+
		"c|\5\2\13\f\17\17\"\"\u0165\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2"+
		"\2\5s\3\2\2\2\7u\3\2\2\2\tz\3\2\2\2\13\177\3\2\2\2\r\u0083\3\2\2\2\17"+
		"\u0089\3\2\2\2\21\u0090\3\2\2\2\23\u0099\3\2\2\2\25\u00a0\3\2\2\2\27\u00a6"+
		"\3\2\2\2\31\u00a8\3\2\2\2\33\u00aa\3\2\2\2\35\u00ac\3\2\2\2\37\u00ae\3"+
		"\2\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2%\u00b8\3\2\2\2\'\u00bd\3\2\2\2)\u00bf"+
		"\3\2\2\2+\u00c1\3\2\2\2-\u00c4\3\2\2\2/\u00c7\3\2\2\2\61\u00ca\3\2\2\2"+
		"\63\u00cd\3\2\2\2\65\u00d0\3\2\2\2\67\u00d4\3\2\2\29\u00dc\3\2\2\2;\u00e3"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00e8\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E"+
		"\u00ee\3\2\2\2G\u00f0\3\2\2\2I\u00f2\3\2\2\2K\u00f4\3\2\2\2M\u00f6\3\2"+
		"\2\2O\u00f8\3\2\2\2Q\u00fa\3\2\2\2S\u00ff\3\2\2\2U\u0107\3\2\2\2W\u010f"+
		"\3\2\2\2Y\u0114\3\2\2\2[\u011c\3\2\2\2]\u0122\3\2\2\2_\u0129\3\2\2\2a"+
		"\u012f\3\2\2\2c\u0134\3\2\2\2e\u013d\3\2\2\2g\u0141\3\2\2\2i\u0147\3\2"+
		"\2\2k\u0149\3\2\2\2m\u0153\3\2\2\2o\u015e\3\2\2\2qr\t\2\2\2r\4\3\2\2\2"+
		"st\7\60\2\2t\6\3\2\2\2uv\7r\2\2vw\7q\2\2wx\7p\2\2xy\7q\2\2y\b\3\2\2\2"+
		"z{\7t\2\2{|\7k\2\2|}\7p\2\2}~\7q\2\2~\n\3\2\2\2\177\u0080\7v\2\2\u0080"+
		"\u0081\7c\2\2\u0081\u0082\7w\2\2\u0082\f\3\2\2\2\u0083\u0084\7m\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7v\2\2\u0086\u0087\7q\2\2\u0087\u0088\7c\2\2"+
		"\u0088\16\3\2\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7"+
		"i\2\2\u008c\u008d\7c\2\2\u008d\u008e\7t\2\2\u008e\u008f\7k\2\2\u008f\20"+
		"\3\2\2\2\u0090\u0091\7o\2\2\u0091\u0092\7g\2\2\u0092\u0093\7m\2\2\u0093"+
		"\u0094\7c\2\2\u0094\u0095\7o\2\2\u0095\u0096\7g\2\2\u0096\u0097\7m\2\2"+
		"\u0097\u0098\7c\2\2\u0098\22\3\2\2\2\u0099\u009a\7v\2\2\u009a\u009b\7"+
		"c\2\2\u009b\u009c\7w\2\2\u009c\u009d\7k\2\2\u009d\u009e\7t\2\2\u009e\u009f"+
		"\7c\2\2\u009f\24\3\2\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3"+
		"\7p\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a5\7k\2\2\u00a5\26\3\2\2\2\u00a6\u00a7"+
		"\7-\2\2\u00a7\30\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\32\3\2\2\2\u00aa\u00ab"+
		"\7,\2\2\u00ab\34\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\36\3\2\2\2\u00ae\u00af"+
		"\7\'\2\2\u00af \3\2\2\2\u00b0\u00b1\7c\2\2\u00b1\"\3\2\2\2\u00b2\u00b3"+
		"\7t\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7k\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7m\2\2\u00b9\u00ba\7q\2\2\u00ba"+
		"\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc&\3\2\2\2\u00bd\u00be\7@\2\2\u00be"+
		"(\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0*\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c3"+
		"\7?\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7>\2\2\u00c5\u00c6\7?\2\2\u00c6.\3"+
		"\2\2\2\u00c7\u00c8\7?\2\2\u00c8\u00c9\7?\2\2\u00c9\60\3\2\2\2\u00ca\u00cb"+
		"\7#\2\2\u00cb\u00cc\7?\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf"+
		"\7g\2\2\u00cf\64\3\2\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3"+
		"\7g\2\2\u00d3\66\3\2\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7"+
		"\7t\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7i\2\2\u00da"+
		"\u00db\7c\2\2\u00db8\3\2\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7j\2\2\u00de"+
		"\u00df\7c\2\2\u00df\u00e0\7m\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7c\2\2"+
		"\u00e2:\3\2\2\2\u00e3\u00e4\7o\2\2\u00e4\u00e5\7q\2\2\u00e5<\3\2\2\2\u00e6"+
		"\u00e7\7?\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7}\2\2\u00e9@\3\2\2\2\u00ea\u00eb"+
		"\7\177\2\2\u00ebB\3\2\2\2\u00ec\u00ed\7*\2\2\u00edD\3\2\2\2\u00ee\u00ef"+
		"\7+\2\2\u00efF\3\2\2\2\u00f0\u00f1\7]\2\2\u00f1H\3\2\2\2\u00f2\u00f3\7"+
		"_\2\2\u00f3J\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5L\3\2\2\2\u00f6\u00f7\7~"+
		"\2\2\u00f7N\3\2\2\2\u00f8\u00f9\7<\2\2\u00f9P\3\2\2\2\u00fa\u00fb\7j\2"+
		"\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7g\2\2\u00feR\3\2"+
		"\2\2\u00ff\u0100\7o\2\2\u0100\u0101\7w\2\2\u0101\u0102\7v\2\2\u0102\u0103"+
		"\7w\2\2\u0103\u0104\7p\2\2\u0104\u0105\7i\2\2\u0105\u0106\7c\2\2\u0106"+
		"T\3\2\2\2\u0107\u0108\7v\2\2\u0108\u0109\7w\2\2\u0109\u010a\7j\2\2\u010a"+
		"\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c\u010d\7i\2\2\u010d\u010e\7c\2\2"+
		"\u010eV\3\2\2\2\u010f\u0110\7o\2\2\u0110\u0111\7c\2\2\u0111\u0112\7v\2"+
		"\2\u0112\u0113\7g\2\2\u0113X\3\2\2\2\u0114\u0115\7r\2\2\u0115\u0116\7"+
		"c\2\2\u0116\u0117\7m\2\2\u0117\u0118\7k\2\2\u0118\u0119\7c\2\2\u0119\u011a"+
		"\7m\2\2\u011a\u011b\7c\2\2\u011bZ\3\2\2\2\u011c\u011d\7h\2\2\u011d\u011e"+
		"\7k\2\2\u011e\u011f\7d\2\2\u011f\u0120\7q\2\2\u0120\u0121\7q\2\2\u0121"+
		"\\\3\2\2\2\u0122\u0123\7r\2\2\u0123\u0124\7q\2\2\u0124\u0125\7m\2\2\u0125"+
		"\u0126\7c\2\2\u0126\u0127\7r\2\2\u0127\u0128\7w\2\2\u0128^\3\2\2\2\u0129"+
		"\u012a\7v\2\2\u012a\u012b\7g\2\2\u012b\u012c\7k\2\2\u012c\u012d\7p\2\2"+
		"\u012d\u012e\7c\2\2\u012e`\3\2\2\2\u012f\u0130\7o\2\2\u0130\u0131\7c\2"+
		"\2\u0131\u0132\7p\2\2\u0132\u0133\7c\2\2\u0133b\3\2\2\2\u0134\u0135\7"+
		"v\2\2\u0135\u0136\7w\2\2\u0136\u0137\7j\2\2\u0137\u0138\7k\2\2\u0138\u0139"+
		"\7p\2\2\u0139\u013a\7i\2\2\u013a\u013b\7c\2\2\u013bd\3\2\2\2\u013c\u013e"+
		"\5\3\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140f\3\2\2\2\u0141\u0142\5e\63\2\u0142\u0143\5\5\3\2"+
		"\u0143\u0144\5e\63\2\u0144h\3\2\2\2\u0145\u0148\5\7\4\2\u0146\u0148\5"+
		"\t\5\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148j\3\2\2\2\u0149\u014d"+
		"\7$\2\2\u014a\u014c\13\2\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u0150\u0151\7$\2\2\u0151l\3\2\2\2\u0152\u0154\t\3\2\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u015a\3\2\2\2\u0157\u0159\t\4\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2"+
		"\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015bn\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015d\u015f\t\5\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\b8"+
		"\2\2\u0163p\3\2\2\2\t\2\u013f\u0147\u014d\u0155\u015a\u0160\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}