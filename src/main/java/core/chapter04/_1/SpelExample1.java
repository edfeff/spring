package core.chapter04._1;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * literal string expression
 * 文本字符串解析
 * <p>
 * 您最可能使用的SpEL类和接口位于org.springframework.expression包及其子包中，例如spel.support。
 * <p>
 * ExpressionParser接口负责解析表达式字符串。
 * 在前面的示例中，表达式字符串是由周围的单引号表示的字符串文字。Expression接口负责评估先前定义的表达式字符串。
 * 分别调用parser.parseExpression和exp.getValue时，可以引发两个异常，ParseException和EvaluationException。
 */
public class SpelExample1 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression helloWorld = parser.parseExpression("'hello world'");
        String value = (String) helloWorld.getValue();
        System.out.println(value);
    }
}
