package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

/**
 * This class represents an addition operation
 */
public class Addition implements ASTNode{
    private ASTNode operator1; // Node for the first operator
    private ASTNode operator2; // Node for the second operator

    /**
     * Constructor for the addition operation
     * @param operator1
     * @param operator2
     */
    public Addition(ASTNode operator1, ASTNode operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    /**
     * Executes the addition operation
     * @param symbolTable
     * @return The result of the addition
     */
    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        return (int) operator1.execute(symbolTable) + (int) operator2.execute(symbolTable);
    }
}

