package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

/**
 * This class represents a return statement
 */
public class Return implements ASTNode{
    private ASTNode expression; // Node for the expression

    /**
     * Constructor for the return statement
     * @param expression
     */
    public Return(ASTNode expression) {
        this.expression = expression;
    }

    /**
     * Executes the return statement
     * @param symbolTable
     * @return The value of the expression
     */
    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {

        // Get the actual function
        String actualFunction = (String) symbolTable.get("actualFunction").a;

        try {
            // Try to parse the expression as an integer
            Integer.parseInt(expression.execute(symbolTable).toString());

            if (symbolTable.get(actualFunction).a.equals("entero")) {
                // If the function returns an integer, then return the value of the expression if it is an integer

                // Get the value of the expression
                Object value = expression.execute(symbolTable);

                // Update the symbol table
                symbolTable.put(actualFunction, new Pair<>("entero", value));

                // Remove the actual function from the symbol table
                symbolTable.remove("actualFunction");

                // Print the return value
                System.out.println("Return " + value);

                // Return the value
                return value;
            } else {
                // If the function returns a character and the return value is an integer, throw an error
                System.err.println("La función " + actualFunction + " debe retornar un caracter y tratas de retornar un entero.") ;
                System.exit(1);
                return null;
            }
        } catch (NumberFormatException e) {
            // If the expression is not an integer, then it must be a character
            if (symbolTable.get(actualFunction).a.equals("caracter")) {
                // Get the value of the expression
                Object value = expression.execute(symbolTable);

                // Update the symbol table
                symbolTable.put(actualFunction, new Pair<>("caracter", value));

                // Remove the actual function from the symbol table
                symbolTable.remove("actualFunction");

                // Print the return value
                System.out.println("Return " + value);

                // Return the value
                return value;
            } else {
                // If the function returns an integer and the return value is a character, throw an error
                System.err.println("La función " + actualFunction + " debe retornar un entero y tratas de retornar un caracter.") ;
                System.exit(1);
                return null;
            }
        }
    }
}
