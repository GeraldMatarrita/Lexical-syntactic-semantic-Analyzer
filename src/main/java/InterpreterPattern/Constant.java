package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

public class Constant implements ASTNode{
    private Object value;

    public Constant(Object value) {
        this.value = value;
    }

    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        return value;
    }
}
