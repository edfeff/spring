package core.chapter04._1._1;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * 解析上下文
 * EvaluationContext
 * <p>
 * 在评估表达式以解析属性，方法或字段并帮助执行类型转换时，使用EvaluationContext接口。 Spring提供了两种实现。
 * <p>
 * SimpleEvaluationContext
 * 针对不需要完整SpEL语言语法范围且应受到有意义限制的表达式类别，公开了SpEL基本语言功能和配置选项的子集。
 * 示例包括但不限于数据绑定表达式和基于属性的过滤器。
 * StandardEvaluationContext
 * 公开SpEL语言功能和配置选项的全部集合。
 * 您可以使用它来指定默认的根对象并配置每个可用的评估相关策略。
 * <p>
 * SimpleEvaluationContext 设计为仅支持SpEL语言语法的子集。
 * 它不包括Java类型引用，构造函数和Bean引用。
 * 它还要求您明确选择对表达式中的属性和方法的支持级别。
 * 默认情况下，create（）静态工厂方法仅启用对属性的读取访问。
 * 您还可以获取构建器来配置所需的确切支持级别，并针对以下一种或某种组合：
 * <p>
 * Custom PropertyAccessor only (no reflection) 仅仅定制
 * <p>
 * Data binding properties for read-only access 绑定只读属性
 * <p>
 * Data binding properties for read and write 绑定读写属性
 * <p>
 * <p>
 * 类型转换
 * <p>
 * 默认情况下，SpEL使用Spring核心中可用的转换服务（org.springframework.core.convert.ConversionService）。
 * 此转换服务附带许多内置转换器，用于常见转换，但也可以完全扩展，以便您可以在类型之间添加自定义转换。
 * 此外，它是泛型感知的。
 * 这意味着，当您在表达式中使用泛型类型时，SpEL会尝试进行转换以维护遇到的任何对象的类型正确性。
 * 实际上这是什么意思？假设使用setValue（）进行赋值来设置List属性。该属性的类型实际上是List 。
 * SpEL认识到列表中的元素在放入列表之前需要转换为布尔值。以下示例显示了如何执行此操作：
 *
 * <p>
 *
 * @author wpp
 */
public class EvaluationContextExample1 {
    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.booleanList.add(true);

        //构建一个只读的上下文
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();

        ExpressionParser parser = new SpelExpressionParser();

        // "false" is passed in here as a String. SpEL and the conversion service
        // will recognize that it needs to be a Boolean and convert it accordingly.
        //字符串false被转出布尔类型并赋值到simple的booleanList的0位置
        parser.parseExpression("booleanList[0]").setValue(context, simple, "false");
        parser.parseExpression("booleanList[1]").setValue(context, simple, "true");

        Boolean a = simple.booleanList.get(0);
        System.out.println(a);

        Boolean b = simple.booleanList.get(1);
        System.out.println(b);
    }
}

class Simple {
    public List<Boolean> booleanList = new ArrayList<>();
}
