package core.chapter04._3._15;

import core.chapter04._3.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * Gradle的 Elvis操作符，简化了3元运算符的写法
 * <p>
 * bool ? true :false
 * --->
 * bool?:true
 *
 * @author wangpp
 */
public class ElvisOperator {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        Inventor tesla = Inventor.getInventor("wpp");
        String value = parser.parseExpression("name?:'defaultName'").getValue(context, tesla, String.class);
        System.out.println(value);

        tesla.setName(null);
        value = parser.parseExpression("name?:'defaultName'").getValue(context, tesla, String.class);
        System.out.println(value);



    }
}
