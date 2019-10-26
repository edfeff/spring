package core.chapter04._3._7;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 数学运算符
 * <p>
 * 加法运算符可用于数字和字符串。 减法，乘法和
 * 除法只能用于数字。 支持的其他数学运算符是模量（％）
 * 和指数幂（^）。 强制执行标准运算符优先级。 这些操作员是
 * 如下所示。
 *
 * @author wangpp
 */
public class MathematicalOperatorSpelExaple1 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        // Addition
        int two = parser.parseExpression("1 + 1").getValue(Integer.class);
        // 'test string'
        String testString = parser.parseExpression("'test' + ' ' + 'string'").getValue(String.class);
        System.out.println(two);
        System.out.println(testString);

        // Subtraction
        int four = parser.parseExpression("1 - -3").getValue(Integer.class);
        double d = parser.parseExpression("1000.00 - 1e4").getValue(Double.class);
        System.out.println(four);
        System.out.println(d);

        // Multiplication
        int six = parser.parseExpression("-2 * -3").getValue(Integer.class);
        double twentyFour = parser.parseExpression("2.0 * 3e0 * 4").getValue(Double.class);
        System.out.println(six);
        System.out.println(twentyFour);

        // Division
        int minusTwo = parser.parseExpression("6 / -3").getValue(Integer.class);
        double one = parser.parseExpression("8.0 / 4e0 / 2").getValue(Double.class);
        System.out.println(minusTwo);
        System.out.println(one);

        // Modulus
        int three = parser.parseExpression("7 % 4").getValue(Integer.class);
        int one1 = parser.parseExpression("8 / 5 % 2").getValue(Integer.class);
        System.out.println(three);
        System.out.println(one1);

        // Operator precedence
        int minusTwentyOne = parser.parseExpression("1+2-3*8").getValue(Integer.class);
        System.out.println(minusTwentyOne);
    }
}

