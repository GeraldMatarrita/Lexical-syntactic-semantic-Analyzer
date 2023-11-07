package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

public class VariableDeclaration implements ASTNode {
    private String name;
    private String type;

    public VariableDeclaration(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        if (type.equals("entero")) symbolTable.put(name, new Pair<>(type, 0));
        if (type.equals("caracter")) symbolTable.put(name, new Pair<>(type, ' '));
        return null;
    }
}
