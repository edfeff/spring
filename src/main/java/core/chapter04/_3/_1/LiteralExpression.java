package core.chapter04._3._1;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 数字支持使用负号，指数符号和小数点。默认情况下，使用Double.parseDouble（）解析实数。
 *
 * @author wpp
 */
public class LiteralExpression {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        String helloWorld = (String) parser.parseExpression("'hello world'").getValue();
        System.out.println(helloWorld);

        Double doubleNumber = (Double) parser.parseExpression("8.111101").getValue();
        System.out.println(doubleNumber);

        int intNumber = (int) parser.parseExpression("0x7FFFFFFF").getValue();
        System.out.println(intNumber);

        boolean bool = (boolean) parser.parseExpression("true").getValue();
        System.out.println(bool);

        Object nullObject = parser.parseExpression("null").getValue();
        System.out.println(nullObject);
    }

}
