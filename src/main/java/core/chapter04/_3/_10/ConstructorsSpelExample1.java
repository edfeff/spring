package core.chapter04._3._10;

import core.chapter04._3.Inventor;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Constructors
 * 构造器
 * <p>
 * 必须使用全限定名
 *
 * @author wangpp
 */
public class ConstructorsSpelExample1 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Inventor value = parser.parseExpression("new core.chapter04._3.Inventor('wpp',new java.util.Date(),'place')").getValue(Inventor.class);
        System.out.println(value);
    }
}
