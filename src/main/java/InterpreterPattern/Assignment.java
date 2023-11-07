package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

/**
 * This class represents an assignment operation
 */
public class Assignment implements ASTNode {

    private String name; // Name of the variable
    private ASTNode expression; // Expression to be assigned

    /**
     * Constructor for the assignment operation
     * @param name
     * @param expression
     */
    public Assignment(String name, ASTNode expression) {
        this.name = name;
        this.expression = expression;
    }

    /**
     * Executes the assignment operation
     * @param symbolTable
     * @return The result of the assignment
     */
    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {

        // If the variable has not been declared, throw an error
        if (symbolTable.get(name) == null){
            System.err.println("Error: La variable " + name + " no ha sido declarada.");
            System.exit(1);
            return null;
        }

        try {
            // Integer value of the expression (If it is an integer)
            Integer expression_ = Integer.parseInt(expression.execute(symbolTable).toString());
            // Integer value of the variable (If it is an integer)
            Integer value = Integer.parseInt(symbolTable.get(name).b.toString());

            // Assign the value to the variable in the symbol table
            symbolTable.put(name, new Pair<>("entero", expression_));
            return null;
        } catch (Exception e) {
            // If the expression is not an integer, try to assign it to the variable
            try {
                if (expression.execute(symbolTable) != null && symbolTable.get(name).a.equals("entero")) {
                    // If the expression is not null and the variable is an integer, assign the value to the variable
                    symbolTable.put(name, new Pair<>("entero", Integer.valueOf(symbolTable.get(name).b.toString())));
                }

                if (symbolTable.get(name).a.equals("caracter") ) {
                    try {
                        // If the variable is a character, try to assign the value to the variable
                        VariableReference reference = (VariableReference) expression;
                        symbolTable.put(name, new Pair<>("caracter", reference.getName()));
                    } catch (Exception e1) {
                        // If the expression is not a character, throw an error
                        System.err.println("Error: La variable " + name + " es de tipo caracter y tratas de asignar un entero.");
                        System.exit(1);
                        return null;
                    }
                } else {
                    // If the variable is not a character, throw an error
                    System.err.println("Error: La variable " + name + " es de tipo entero y tratas de asignar un caracter.");
                    System.exit(1);
                    return null;
                }

                return null;

            } catch (NumberFormatException e2) {
                // If the expression is not a number, throw an error
                System.err.println("Error: Typos de datos incompatibles.");
                System.exit(1);
                return null;
            }
        }
    }
}
