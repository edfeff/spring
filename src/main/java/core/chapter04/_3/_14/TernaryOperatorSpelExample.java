package core.chapter04._3._14;

import core.chapter04._3.Inventor;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 三元运算符
 *
 * @author wangpp
 */
public class TernaryOperatorSpelExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        String value = parser.parseExpression("false ? '1':'2'").getValue(String.class);
        System.out.println(value);

        Inventor inventor = Inventor.getInventor("wpp");

        String value1 = parser.parseExpression("true ? name : 'defaultName'").getValue(inventor, String.class);
        System.out.println(value1);

    }
}
