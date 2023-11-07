package InterpreterPattern;

import org.antlr.v4.runtime.misc.Pair;

import java.util.Map;

public class Multiplication implements ASTNode{
    private ASTNode operator1;
    private ASTNode operator2;

    public Multiplication(ASTNode operator1, ASTNode operator2) {
        this.operator1 = operator1;
        this.operator2 = operator2;
    }

    @Override
    public Object execute(Map<String, Pair<String, Object>> symbolTable) {
        return (int) operator1.execute(symbolTable) * (int) operator2.execute(symbolTable);
    }
}

