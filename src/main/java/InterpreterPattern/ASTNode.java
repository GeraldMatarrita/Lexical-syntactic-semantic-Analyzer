package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

/**
 * This interface represents a node in the AST
 */
public interface ASTNode {

    /**
     * Executes the node
     * @param symbolTable
     * @return The result of the execution
     */
    public Object execute(Map<String, Pair<String, Object>> symbolTable);
}
