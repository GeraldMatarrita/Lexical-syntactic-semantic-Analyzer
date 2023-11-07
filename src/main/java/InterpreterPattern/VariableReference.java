package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

/**
 * This class represents a variable reference
 */
public class VariableReference implements ASTNode{

    private String name; // Name of the variable
    private String type; // Type of the variable

    /**
     * Constructor for the variable reference
     * @param name
     */
    public VariableReference(String name) {
        super();
        this.name = name;
    }

    /**
     * Executes the variable reference
     * @param symbolTable
     * @return The value of the variable
     */
    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        if (symbolTable.get(name) == null) return null;
        return symbolTable.get(name).b;
    }

    /**
     * Getter for the name of the variable
     * @return The name of the variable
     */
    public String getName() {
        return name;
    }
}
