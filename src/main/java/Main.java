import ANTLRClases.miLenguajeLexer;
import ANTLRClases.miLenguajeParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {

        // Error message if the number of arguments is incorrect
        if (args.length != 2) {
            System.out.println("Uso incorrecto. Debes proporcionar un archivo de entrada y el nombre del archivo de salida.");
            return;
        }

        String inputFileName = args[0]; // The input is taken from the first argument
        String outputFileName = args[1]; // The name of the output file is taken from the second argument

        // Reads the file with the program in the language miLenguaje
        CharStream input = CharStreams.fromFileName(inputFileName);

        // Creates a lexer and a parser for the program with ANTLR
        miLenguajeLexer lexer = new miLenguajeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        miLenguajeParser parser = new miLenguajeParser(tokens);

        // Executes the parser to generate a parse tree for the program with ANTLR
        ParseTree tree = parser.start();

        // Redirect the output to a file
        try (PrintWriter writer = new PrintWriter(outputFileName)) {

            writer.println("Tokens (Fase Léxica):");

            for (Token token : tokens.getTokens()) {
                writer.println(token.getType() + ": " + token.getText());
            }

            writer.println("\nÁrbol de Análisis Sintáctico (Fase Sintáctica):");

            // Write the parse tree in tree form to the output file
            printParseTree(tree, writer);

            writer.println("\nTabla de Símbolos (Fase Semántica):");
            // Obtains the symbol table from the parser and write it to the output file
            Map<String, Pair<String, Object>> symbolTable = parser.symbolTable;
            for (Map.Entry<String, Pair<String, Object>> entry : symbolTable.entrySet()) {
                writer.println(entry.getKey() + " = " + entry.getValue().b);
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de salida: " + e.getMessage());
        }
    }

    /**
     * Prints the parse tree in tree form to the output file.
     *
     * @param tree The parse tree to print.
     * @param writer The writer to write the parse tree.
     */
    public static void printParseTree(ParseTree tree, PrintWriter writer) {
        printParseTree(tree, writer, 0);
    }

    /**
     * Prints the parse tree in tree form to the output file.
     *
     * @param tree The parse tree to print.
     * @param writer The writer to write the parse tree.
     * @param depth The depth of the tree.
     */
    private static void printParseTree(ParseTree tree, PrintWriter writer, int depth) {
        for (int i = 0; i < depth; i++) {
            writer.print("  "); // Indent based on depth
        }
        writer.println(tree.toString());

        for (int i = 0; i < tree.getChildCount(); i++) {
            printParseTree(tree.getChild(i), writer, depth + 1);
        }
    }
}
