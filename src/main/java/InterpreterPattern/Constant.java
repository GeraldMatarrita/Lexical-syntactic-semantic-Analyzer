package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

/**
 * This class represents a constant
 */
public class Constant implements ASTNode{
    private Object value; // Value of the constant

    /**
     * Constructor for the constant
     * @param value
     */
    public Constant(Object value) {
        this.value = value;
    }

    /**
     * Executes the constant
     * @param symbolTable
     * @return The value of the constant
     */
    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        return value;
    }
}
