package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

public class FunctionDeclaration implements ASTNode{
    private String name;
    private String type;

    public FunctionDeclaration(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        symbolTable.put(name, new Pair<>(type, null));
        return null;
    }
}
