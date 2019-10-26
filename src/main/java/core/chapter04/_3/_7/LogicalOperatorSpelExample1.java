package core.chapter04._3._7;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 逻辑运算符
 * <p>
 * and or not
 *
 * @author wangpp
 */
public class LogicalOperatorSpelExample1 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Boolean b1 = parser.parseExpression("true and false").getValue(Boolean.class);
        Boolean b2 = parser.parseExpression("true or false").getValue(Boolean.class);
        Boolean b3 = parser.parseExpression("not true").getValue(Boolean.class);
        Boolean b31 = parser.parseExpression("! true").getValue(Boolean.class);
        System.out.printf("%s,%s,%s,%s\n", b1, b2, b3, b31);

        SocietyContext context = new SocietyContext();
        String isMemberExpression = "isMember('wpp') and isMember('wpppppppppp')";

        Boolean b4 = parser.parseExpression(isMemberExpression).getValue(context, Boolean.class);
        System.out.println(b4);


    }
}

class SocietyContext {
    public static boolean isMember(String name) {
        return name.length() > 10;
    }
}
