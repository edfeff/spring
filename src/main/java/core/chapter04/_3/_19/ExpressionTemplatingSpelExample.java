package core.chapter04._3._19;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 表达式模板
 * <p>
 * 表达式模板允许将文字文本与一个或多个评估块混合在一起。 每
 * 评估块由您可以定义的前缀和后缀字符分隔，常见的选择是使用＃{}作为分隔符。 例如，
 *
 * @author wpp
 */
public class ExpressionTemplatingSpelExample {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        String value = parser.parseExpression(
                "random number is #{T(java.lang.Math).random()}",
                new TemplateParserContext()).getValue(String.class);

        System.out.println(value);

//        自定义前后缀
        value = parser.parseExpression(
                "random number is @{T(java.lang.Math).random()}",
                new TemplateParserContext("@{", "}")).getValue(String.class);
        System.out.println(value);

    }
}
