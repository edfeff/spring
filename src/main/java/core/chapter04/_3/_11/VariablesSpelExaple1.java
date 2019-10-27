package core.chapter04._3._11;

import core.chapter04._3.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * 表达式中的变量
 * 1. 通过ExpressionContext可以设置一些变量，然后通过#X的方式在表达式中引用
 *
 * @author wangpp
 */
public class VariablesSpelExaple1 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Inventor inventor = Inventor.getInventor("oldName");
        System.out.println(inventor.getName());

        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();
        context.setVariable("newName", "new-Name");

        parser.parseExpression("Name = #newName").getValue(context, inventor);
        System.out.println(inventor.getName());

    }
}
