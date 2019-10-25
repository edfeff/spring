package core.chapter04._1._2;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.List;

/**
 * 可以使用解析器配置对象（org.springframework.expression.spel.SpelParserConfiguration）配置SpEL表达式解析器。
 * 配置对象控制某些表达式组件的行为。
 * <p>
 * 例如，如果您索引到数组或集合中并且指定索引处的元素为null，则可以自动创建该元素。
 * 当使用由属性引用链组成的表达式时，这很有用。
 * 如果您索引到数组或列表中并指定了超出数组或列表当前大小末尾的索引，则可以自动增长数组或列表以容纳该索引。
 * <p>
 * 下面的示例演示如何自动增加列表：
 *
 * @author wpp
 */
public class SpelParserConfigurationExample {
    public static void main(String[] args) {

        // Turn on:
        // - auto null reference initialization 开启null初始化
        // - auto collection growing            集合自动增长
        SpelParserConfiguration configuration = new SpelParserConfiguration(true, true);

        ExpressionParser parser = new SpelExpressionParser(configuration);

//        取出list的3元素，实际是不存在的，但他会进行自动初始化，并自动扩容
        Expression expression = parser.parseExpression("list[3]");

        Demo demo = new Demo();
        System.out.println("before size: " + demo.list);

        String value = (String) expression.getValue(demo);

        System.out.println("after size: " + demo.list.size());
    }
}

class Demo {
    public List<String> list;
}
