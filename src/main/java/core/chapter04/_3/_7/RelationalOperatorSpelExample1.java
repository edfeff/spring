package core.chapter04._3._7;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * 关系操作符
 * <p>
 * <p>
 * 对null的大于/小于比较遵循一个简单的规则：将null视为
 * 这里没有（即非零）。 结果，任何其他值总是
 * 大于null（X> null始终为true），并且其他任何值都不小于
 * 什么都没有（X <null始终为false）。
 * 如果您更喜欢数字比较，请避免使用基于数字的null
 * 比较时，建议与零进行比较（例如X> 0或X <0）。
 * <p>
 * <p>
 * 除标准关系运算符外，SpEL还支持instanceof和正则表达式
 * 基于匹配的运算符。
 * <p>
 * <p>
 * 每个符号运算符也可以指定为纯字母等效项。 这样可以避免
 * 使用的符号对于文档类型具有特殊含义的问题
 * 表达式被嵌入（例如XML文档）。 此处显示等效的文字：lt（<），gt
 * （>），le（<=），ge（> =），eq（==），ne（！=），div（/），mod（％），而不是（！）。 这些不区分大小写。
 *
 * @author wangpp
 */
public class RelationalOperatorSpelExample1 {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Boolean b1 = parser.parseExpression("2==2").getValue(Boolean.class);
        Boolean b11 = parser.parseExpression("2 eq 2").getValue(Boolean.class);
        Boolean b2 = parser.parseExpression("2 < -5.1").getValue(Boolean.class);
        Boolean b21 = parser.parseExpression("2 lt -5.1").getValue(Boolean.class);
        Boolean b3 = parser.parseExpression("'abc' > 'abz'").getValue(Boolean.class);
        Boolean b31 = parser.parseExpression("'abc' gt 'abz'").getValue(Boolean.class);

        System.out.println(b1 + " " + b11);
        System.out.println(b2 + " " + b21);
        System.out.println(b3 + " " + b31);


        boolean b4 = parser.parseExpression("'xyz' instanceof T(Integer)").getValue(Boolean.class);
        Boolean b41 = parser.parseExpression("'xyz' instanceof T(String)").getValue(Boolean.class);
        System.out.println(b4 + "--" + b41);
        //instanceof 比较用于包装类，不能用于基本类型

        Boolean b42 = parser.parseExpression("1 instanceof T(int)").getValue(Boolean.class);
        Boolean b43 = parser.parseExpression("1 instanceof T(Integer)").getValue(Boolean.class);
        System.out.println("int  " + b42);
        System.out.println("Integer " + b43);


// evaluates to true
        boolean b5 = parser.parseExpression("'5.00' matches '^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
        boolean b51 = parser.parseExpression("'-5.00' matches '^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
        boolean b52 = parser.parseExpression("'-100.00' matches '^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
//evaluates to false
        boolean b6 = parser.parseExpression("'5.0067' matches '^-?\\d+(\\.\\d{2})?$'").getValue(Boolean.class);
        System.out.println(b5 + " " + b51 + " " + b52);
        System.out.println(b6);

        //关系符号


    }
}
