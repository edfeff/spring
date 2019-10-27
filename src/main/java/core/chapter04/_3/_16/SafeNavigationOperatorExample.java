package core.chapter04._3._16;

import core.chapter04._3.Inventor;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * Safe Navigation operator
 * 用于避免NPE的导航
 * <p>
 * 当遇到对象为null时，防止跑出NPE，表达式会返回null
 *
 * @author wangpp
 */
public class SafeNavigationOperatorExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        SimpleEvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        Inventor tesla = Inventor.getInventor();

        String value = parser.parseExpression("placeOfBirth?.city").getValue(context, tesla, String.class);
        System.out.println(value);

        tesla.setPlaceOfBirth(null);

        value = parser.parseExpression("placeOfBirth?.city").getValue(context, tesla, String.class);
        System.out.println(value);


    }
}
