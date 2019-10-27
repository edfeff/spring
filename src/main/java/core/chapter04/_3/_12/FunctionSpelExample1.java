package core.chapter04._3._12;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.lang.reflect.Method;

/**
 * 函数
 * 自定义函数来扩展Spel表达式
 *
 * @author wangpp
 */
public class FunctionSpelExample1 {
    public static void main(String[] args) throws NoSuchMethodException {
        //定义一个函数
        Method reverseString = StringUtil.class.getDeclaredMethod("reverseString", String.class);

//        通过EvaluationContext注册
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        context.setVariable("reverseString", reverseString);

        ExpressionParser parser = new SpelExpressionParser();
        String value = parser.parseExpression("#reverseString('hello')").getValue(context, String.class);
        System.out.println(value);

    }
}

class StringUtil {
    public static String reverseString(String input) {
        StringBuilder backwards = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            backwards.append(input.charAt(input.length() - 1 - i));
        }
        return backwards.toString();
    }
}
