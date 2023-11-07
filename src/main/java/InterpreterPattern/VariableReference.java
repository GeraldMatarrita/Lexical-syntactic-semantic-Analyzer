package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

public class VariableReference implements ASTNode{

    private String name;
    private String type;

    public VariableReference(String name) {
        super();
        this.name = name;
    }

    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        if (symbolTable.get(name) == null) return null;
        return symbolTable.get(name).b;
    }

    public String getName() {
        return name;
    }
}
