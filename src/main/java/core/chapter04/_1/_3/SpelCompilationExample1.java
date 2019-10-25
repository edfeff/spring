package core.chapter04._1._3;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.SpelCompilerMode;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Spring Framework 4.1包含一个基本的表达式编译器。
 * 通常对表达式进行解释，这样可以在评估过程中提供很大的动态灵活性，但不能提供最佳性能。
 * 对于偶尔使用表达式，这很好，但是，当与其他组件（例如Spring Integration）一起使用时，性能可能非常重要，并且不需要动态性。
 * <p>
 * SpEL编译器旨在满足这一需求。
 * 在评估过程中，编译器会生成一个Java类，该类体现了运行时的表达式行为，并使用该类来实现更快的表达式评估。
 * 由于缺少在表达式周围输入内容的信息，因此编译器在执行编译时会使用在表达式的解释式求值过程中收集的信息。
 * 例如，它不仅仅从表达式中就知道属性引用的类型，而是在第一次解释求值时就知道它是什么。
 * 当然，如果各种表达元素的类型随时间变化，则基于此类派生信息进行编译会在以后引起麻烦。
 * 因此，编译最适合类型信息在重复求值时不会改变的表达式。
 * <p>
 * 考虑以下基本表达式：
 * <p>
 * someArray[0].someProperty.someOtherProperty < 0.1
 * <p>
 * 由于前面的表达式涉及数组访问，一些属性取消引用和数字运算，因此性能提升可能非常明显。
 * 在一个示例中，进行了50000次迭代的微基准测试，使用解释器评估需要75毫秒，而使用表达式的编译版本仅需要3毫秒。
 * <p>
 * 编译器配置
 * <p>
 * 默认情况下不打开编译器，但是您可以通过两种不同的方式之一来打开它。
 * 当SpEL用法嵌入到另一个组件中时，可以使用解析器配置过程（前面讨论过）或使用系统属性来打开它。
 * 编译器可以在org.springframework.expression.spel.SpelCompilerMode 枚举中捕获的三种模式之一进行操作。
 * <p>
 * 模式如下：
 * <p>
 * OFF, 关闭 默认情况
 * <p>
 * IMMIATE, 在立即模式下，表达式将尽快编译。通常是在第一次解释评估之后。如果编译的表达式失败（通常是由于类型更改，如前所述），则表达式求值的调用者将收到异常。
 * <p>
 * MIXED 在混合模式下，表达式会随着时间静默在解释模式和编译模式之间切换。
 * 经过一定数量的解释运行后，它们会切换到编译形式，如果编译形式出了问题（例如，如前面所述的类型更改），则表达式会自动再次切换回解释形式。
 * 稍后，它可能会生成另一个已编译的表单并切换到该表单。基本上，用户进入即时模式的异常是在内部处理的。
 * <p>
 * <p>
 * 存在IMMEDIATE模式是因为MIXED模式可能会导致具有副作用的表达式出现问题。
 * 如果已编译的表达式在部分成功后就崩溃了，则它可能已经完成了影响系统状态的操作。
 * 如果发生这种情况，调用者可能不希望它在解释模式下静默地重新运行，因为表达式的一部分可能运行了两次。
 * <p>
 * 选择模式后，使用SpelParserConfiguration配置解析器。以下示例显示了如何执行此操作：
 * <p>
 * 当指定编译器模式时，还可以指定一个类加载器（允许传递null）。
 * 编译的表达式在提供的任何子类加载器中定义。
 * 重要的是要确保，如果指定了类加载器，则它可以查看表达式评估过程中涉及的所有类型。
 * 如果未指定类加载器，则使用默认的类加载器（通常是在表达式求值期间运行的线程的上下文类加载器）。
 * 第二种配置编译器的方法是将SpEL嵌入到其他组件中，并且可能无法通过配置对象进行配置。在这些情况下，可以使用系统属性。
 * 您可以将spring.expression.compiler.mode属性设置为SpelCompilerMode枚举值之一（off, immediate, mixed）。
 * <p>
 * <p>
 * <p>
 * 编译器限制 从Spring Framework 4.1开始，已经有了基本的编译框架。
 * 但是，该框架尚不支持编译每种表达式。
 * 最初的重点是可能在性能关键型上下文中使用的通用表达式。
 * 目前无法编译以下类型的表达式：
 * <p>
 * 涉及赋值的表达
 * 表达式依赖转换服务
 * 使用自定义解析器或访问器的表达式
 * 使用选择或投影的表达式
 * <p>
 * 将来会编译更多类型的表达。
 */
public class SpelCompilationExample1 {
    public static void main(String[] args) {
        SpelParserConfiguration configuration =
                new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE,
                        SpelCompilationExample1.class.getClassLoader());

        SpelExpressionParser parser = new SpelExpressionParser(configuration);

        Expression expr = parser.parseExpression("payload");

        MyMessage message = new MyMessage();

        Object value = expr.getValue(message);

    }
}

class MyMessage {
    public String header;
    public String payload;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
