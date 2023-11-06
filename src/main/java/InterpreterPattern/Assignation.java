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
        if (symbolTable.get(name) instanceof Integer && expression.execute(symbolTable) instanceof Integer){
            symbolTable.put(name, execute(symbolTable));
            return null;
        } else if (symbolTable.get(name) instanceof String && expression.execute(symbolTable) instanceof String) {
            symbolTable.put(name, execute(symbolTable));
            return null;
        } else {
            System.out.println("Error: Type mismatch");
            return null;
        }
    }
}
