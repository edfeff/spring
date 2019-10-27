package core.chapter04._3._9;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Date;

/**
 * 使用 T()函数来获取指定类，可以调用static方法
 * 特殊的T运算符可用于指定java.lang.Class（类型）的实例。 静态方法也使用此运算符调用。
 * StandardEvaluationContext使用TypeLocator查找类型和StandardTypeLocator（可以替换）是在了解以下内容的基础上构建的
 * java.lang包。
 * 这意味着对java.lang中的类型的T（）引用不需要完全限定，但所有其他类型引用必须是合格的。
 *
 * @author wangpp
 */
public class TypeSpelExample1 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Class dateClass = parser.parseExpression("T(java.util.Date)").getValue(Class.class);
        System.out.println(dateClass);

        Class stringClass = parser.parseExpression("T(String)").getValue(Class.class);
        System.out.println(stringClass);

        //调用了RoundingMode的静态常量
        boolean trueValue = parser.parseExpression("T(java.math.RoundingMode).CEILING < T(java.math.RoundingMode).FLOOR").getValue(Boolean.class);
        System.out.println(trueValue);
    }
}
