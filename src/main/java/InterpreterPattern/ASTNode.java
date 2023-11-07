package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

public interface ASTNode {

    public Object execute(Map<String, Pair<String, Object>> symbolTable);
}
