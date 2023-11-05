package InterpreterPattern;

import java.util.Map;

public class VariableDeclaration implements ASTNode {
    private String name;


    public VariableDeclaration(String name) {
        this.name = name;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        symbolTable.put(name, null);
        return null;
    }
}
