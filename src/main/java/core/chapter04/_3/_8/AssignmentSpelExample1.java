package core.chapter04._3._8;

import core.chapter04._3.Inventor;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * 赋值
 * <p>
 * 属性的设置是通过使用赋值运算符完成的。 这通常会在
 * 对setValue的调用，但也可以在对getValue的调用内完成。
 *
 * @author wangpp
 */
public class AssignmentSpelExample1 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        //可读写的context
        EvaluationContext context = SimpleEvaluationContext.forReadWriteDataBinding().build();
        Inventor inventor = Inventor.getInventor();

//        通过set方法设置到变量中了
        parser.parseExpression("Name").setValue(context, inventor, "SetName");
        System.out.println(inventor.getName());

//        通过get方法设置到变量中了
        String name = parser.parseExpression("Name = 'GETName'").getValue(context, inventor, String.class);
        System.out.println(name);
        System.out.println(inventor.getName());


    }
}
