package core.chapter04._3._6;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 使用典型的Java编程语法调用方法。 您也可以在
 * 文字。 还支持Varargs。
 * <p>
 * 可使用static方法
 *
 * @author wangpp
 */
public class MethodsSpelExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        String subStr = parser.parseExpression("'abc'.substring(1.3)").getValue(String.class);
        System.out.println(subStr);

        SocietyContext context = new SocietyContext();
        Boolean wpp = parser.parseExpression("isMember('wpp')").getValue(context, Boolean.TYPE);
        Boolean wpppppppppppp = parser.parseExpression("isMember('wpppppppppppp')").getValue(context, Boolean.TYPE);

        System.out.println(wpp + " : " + wpppppppppppp);

    }

}

class SocietyContext {
    public static boolean isMember(String name) {
        return name.length() > 10;
    }
}