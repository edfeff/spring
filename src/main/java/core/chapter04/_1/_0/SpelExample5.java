package core.chapter04._1._0;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

//使用构造函数创建表达式并调用函数
public class SpelExample5 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("new String('hello world').toUpperCase()");
        String value = expression.getValue(String.class);
        System.out.println(value);
    }
}
