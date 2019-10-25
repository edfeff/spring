package core.chapter04._1._0;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 以下调用JavaBean属性的示例将调用String属性Bytes：
 */
public class SpelExample3 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        //调用 getBytes（）
        Expression expression = parser.parseExpression("'hello world'.bytes");
        byte[] value = (byte[]) expression.getValue();


//        对比
        byte[] bytes = "hello world".getBytes();
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i] == bytes[i]);
        }
    }
}
