package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

/**
 * This class represents a subtraction
 */
public class Subtraction implements ASTNode{

    private ASTNode operator1; // Node for the first operator
    private ASTNode operator2; // Node for the second operator

    /**
     * Constructor for the subtraction
     * @param operator1
     * @param operator2
     */
    public Subtraction(ASTNode operator1, ASTNode operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    /**
     * Executes the subtraction
     * @param symbolTable
     * @return The result of the subtraction
     */
    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        return (int) operator1.execute(symbolTable) - (int) operator2.execute(symbolTable);
    }
}
