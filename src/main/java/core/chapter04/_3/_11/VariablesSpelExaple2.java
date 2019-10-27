package core.chapter04._3._11;

import core.chapter04._3.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 表达式中的变量
 * #this 指向当前的表达式对象
 * 和
 * #root 指向表达式Context对象
 *
 * @author wangpp
 */
public class VariablesSpelExaple2 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();

        List<Integer> primes = new ArrayList<>();
        primes.addAll(Arrays.asList(2, 3, 5, 7, 11, 13, 17));

        context.setVariable("primes", primes);
//        使用了选择器 ?[condition]
        List<Integer> list = (List<Integer>) parser.parseExpression("#primes.?[#this>10]").getValue(context);
        System.out.println(list);
    }
}
