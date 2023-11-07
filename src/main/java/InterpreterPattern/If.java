package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.List;
import java.util.Map;

/**
 * This class represents an if statement
 */
public class If implements ASTNode {
    private ASTNode condition; // Node for the condition (boolean)
    private List<ASTNode> body; // List of nodes for the body
    private List<ASTNode> elseBody; // List of nodes for the else body

    /**
     * Constructor for the if statement
     * @param condition
     * @param body
     * @param elseBody
     */
    public If(ASTNode condition, List<ASTNode> body, List<ASTNode> elseBody) {
        this.condition = condition;
        this.body = body;
        this.elseBody = elseBody;
    }

    /**
     * Executes the if statement
     * @param symbolTable
     * @return null
     */
    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        if ((boolean) condition.execute(symbolTable)) {
            for (ASTNode node : body) {
                node.execute(symbolTable);
            }
        } else {
            for (ASTNode node : elseBody) {
                node.execute(symbolTable);
            }
        }
        return null;
    }
}
