package InterpreterPattern;

import java.util.Map;

public class Assignation implements ASTNode{

    private String name;
    private ASTNode expression;

    public Assignation(String name, ASTNode expression) {
        this.name = name;
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {
        symbolTable.put(name, expression.execute(symbolTable));
        return null;
    }
}
