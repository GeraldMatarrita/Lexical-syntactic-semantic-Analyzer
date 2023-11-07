package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

/**
 * This class represents a function declaration
 */
public class FunctionDeclaration implements ASTNode{

    private String name; // Name of the function
    private String type; // Type of the function

    /**
     * Constructor for the function declaration
     * @param name
     * @param type
     */
    public FunctionDeclaration(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Executes the function declaration
     * @param symbolTable
     * @return null
     */
    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        symbolTable.put(name, new Pair<>(type, null));
        return null;
    }
}
