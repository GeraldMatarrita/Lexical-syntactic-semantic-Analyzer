import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        // Reads the file with the program in the language miLenguaje
        String inputFileName = "ejemplo1.ml";
        CharStream input = CharStreams.fromFileName(inputFileName);

        // Creates a lexer and a parser for the program
        miLenguajeLexer lexer = new miLenguajeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miLenguajeParser parser = new miLenguajeParser(tokens);

        // Executes the parser to generate a parse tree for the program
        ParseTree tree = parser.start();

        // Prints the parse tree in LISP format
        System.out.println(tree.toStringTree(parser));

        // Obtains the symbol table from the parser
        Map<String, Pair<String, Object>> symbolTable = parser.symbolTable;

        // Obtains the AST from the parser and prints it
        for (Map.Entry<String, Pair<String, Object>> entry : symbolTable.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue().b);
        }

//        for (Token token : tokens.getTokens()) {
//            System.out.println(token.getType() + ": " + token.getText());
//        }
    }
}
