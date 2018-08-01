import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class HotakaLang {
	private static String load(String preCodeFile) 
			  throws java.io.IOException {
		return new String(
				java.nio.file.Files.readAllBytes(
						java.nio.file.Paths.get(preCodeFile)), 
				java.nio.charset.Charset.forName("UTF-8"));
	}

	public static void main(String[] args) {
		HotakaLangParserParser parser = null;
		try {
			ANTLRInputStream input = new ANTLRInputStream (
					load("ejemplo.txt")) ;
			HotakaLangParserLexer lexer = new HotakaLangParserLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new HotakaLangParserParser(tokens);
			ParseTree tree = parser.programa();
			
			HotakaLangParserSemantic sem = new HotakaLangParserSemantic();
			sem.visit(tree);

		} catch (Exception e) {
			System.err.print(e);
		}
	}
}





