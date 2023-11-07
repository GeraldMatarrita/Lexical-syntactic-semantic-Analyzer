package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

/**
 * This class represents a variable declaration
 */
public class VariableDeclaration implements ASTNode {
    private String name; // Name of the variable
    private String type; // Type of the variable

    /**
     * Constructor for the variable declaration
     * @param name
     * @param type
     */
    public VariableDeclaration(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Executes the variable declaration
     * @param symbolTable
     * @return null
     */
    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        if (type.equals("entero")) symbolTable.put(name, new Pair<>(type, 0));
        if (type.equals("caracter")) symbolTable.put(name, new Pair<>(type, ' '));
        return null;
    }
}
