import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        String inputFileName = "ejemplo1.ml";
        CharStream input = CharStreams.fromFileName(inputFileName);

        miLenguajeLexer lexer = new miLenguajeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miLenguajeParser parser = new miLenguajeParser(tokens);
        miLenguajeBaseListener listener = new miLenguajeBaseListener();

        ParseTree tree = parser.start();

//        System.out.println(tree.toStringTree(parser));

        Map<String, Object> symbolTable = parser.symbolTable;

        for (Map.Entry<String, Object> entry : symbolTable.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

//        System.out.println(tree.toStringTree(parser));
//
//        for (Token token : tokens.getTokens()) {
//            System.out.println(token.getType() + ": " + token.getText());
//        }
    }
}
