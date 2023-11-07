package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

public class Return implements ASTNode{
    private ASTNode expression;

    public Return(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {

        String actualFunction = (String) symbolTable.get("actualFunction").a;

        try {
            Integer.parseInt(expression.execute(symbolTable).toString());
            if (symbolTable.get(actualFunction).a.equals("entero")) {
                Object value = expression.execute(symbolTable);
                symbolTable.put(actualFunction, new Pair<>("entero", value));
                symbolTable.remove("actualFunction");
                System.out.println("Return " + value);
                return value;
            } else {
                System.out.println("Function " + actualFunction + " has a typer return mismatch");
                System.exit(1);
                return null;
            }
        } catch (NumberFormatException e) {
            if (symbolTable.get(actualFunction).a.equals("caracter")) {
                Object value = expression.execute(symbolTable);
                symbolTable.put(actualFunction, new Pair<>("caracter", value));
                symbolTable.remove("actualFunction");
                System.out.println("Return " + value);
                return value;
            } else {
                System.out.println("Function " + actualFunction + " has a typer return mismatch");
                System.exit(1);
                return null;
            }
        }
    }
}
