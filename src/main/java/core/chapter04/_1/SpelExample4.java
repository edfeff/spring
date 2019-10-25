package core.chapter04._1;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelExample4 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("'hello world'.bytes.length");
        int length = (Integer) expression.getValue();

        System.out.println(length);

    }
}
