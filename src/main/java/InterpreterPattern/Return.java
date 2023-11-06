package InterpreterPattern;

import java.util.Map;

public class Return implements ASTNode{
    private ASTNode expression;

    public Return(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Object> symbolTable) {

        String actualFunction = (String) symbolTable.get("actualFunction");
        if (expression.execute(symbolTable) instanceof Integer && symbolTable.get(actualFunction) instanceof Integer) {
            return expression.execute(symbolTable);
        } else if (expression.execute(symbolTable) instanceof String && symbolTable.get(actualFunction) instanceof String) {
            return expression.execute(symbolTable);
        } else {
            System.out.println("Function " + actualFunction + " has a typer return mismatch");
            return null;
        }
    }
}
