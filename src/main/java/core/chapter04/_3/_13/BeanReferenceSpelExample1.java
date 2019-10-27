package core.chapter04._3._13;

import org.springframework.expression.AccessException;
import org.springframework.expression.BeanResolver;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * bean的引用
 * 使用@来引用
 *
 * @author wangpp
 */
public class BeanReferenceSpelExample1 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setBeanResolver(new MyBeanResolver());
        context.setVariable("foo", "str");
        Object value = parser.parseExpression("@foo").getValue(context);
        Object value1 = parser.parseExpression("&foo").getValue(context);
        System.out.println(value);
        System.out.println(value1);

    }
}

class MyBeanResolver implements BeanResolver {

    @Override
    public Object resolve(EvaluationContext context, String beanName) throws AccessException {
        return context.lookupVariable(beanName);
    }
}
