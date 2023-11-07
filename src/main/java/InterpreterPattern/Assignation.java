package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

public class Assignation implements ASTNode {

    private String name;
    private ASTNode expression;

    public Assignation(String name, ASTNode expression) {
        this.name = name;
        this.expression = expression;
    }

    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {

        if (symbolTable.get(name) == null){
            System.out.println("Error: Variable " + name + " not declared");
            return null;
        }

        try {
            Integer expression_ = Integer.parseInt(expression.execute(symbolTable).toString());
            Integer value = Integer.parseInt(symbolTable.get(name).b.toString());

            symbolTable.put(name, new Pair<>("entero", expression_));
            return null;
        } catch (Exception e) {
            try {
                if (expression.execute(symbolTable) != null && symbolTable.get(name).a.equals("entero")) {
                    symbolTable.put(name, new Pair<>("entero", Integer.valueOf(symbolTable.get(name).b.toString())));
                }

                if (symbolTable.get(name).a.equals("caracter") ) {
                    try {
                        VariableReference reference = (VariableReference) expression;
                        symbolTable.put(name, new Pair<>("caracter", reference.getName()));
                    } catch (Exception e1) {
                        System.out.println("Error: Mismatch type");
                        System.exit(1);
                        return null;
                    }
                } else {
                    System.out.println("Error: Mismatch type");
                    System.exit(1);
                    return null;
                }

                return null;

            } catch (NumberFormatException e2) {
                System.out.println("Error: Mismatch type");
                System.exit(1);
                return null;
            }
        }
    }
}
