package core.chapter04._1._0;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 在以下方法调用示例中，我们在字符串文字上调用concat方法：
 */
public class SpelExample2 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("'hello'.concat('world')");
        String expressionString = expression.getExpressionString();
        System.out.println("expression String : " + expressionString);

        String value = (String) expression.getValue();
        System.out.println("value " + value);
        //expression String : 'hello'.concat('world')
        //value helloworld
    }
}
