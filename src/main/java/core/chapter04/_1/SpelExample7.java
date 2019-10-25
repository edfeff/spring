package core.chapter04._1;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

//
public class SpelExample7 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("new String('hello world').toUpperCase()");
        String value = expression.getValue(String.class);
        System.out.println(value);
    }
}
