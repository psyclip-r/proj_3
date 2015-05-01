import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by kuba on 26.04.15.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream(args[0]);

        ProstyJezykLexer lexer = new ProstyJezykLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        ProstyJezykParser parser = new ProstyJezykParser(tokens);

        ParseTree tree = parser.prog();

        //System.out.println(tree.toStringTree(parser));

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new LLVMactions(), tree);

    }

}
