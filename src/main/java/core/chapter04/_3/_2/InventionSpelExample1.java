package core.chapter04._3._2;

import core.chapter04._3.Inventor;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


/**
 * 使用属性引用进行导航很容易。
 * 为此，请使用句点来指示嵌套的属性值。
 * Inventor类的实例pupin和tesla填充有示例部分使用的类中列出的数据。
 * 要向下导航并获取特斯拉的出生年份和普平的出生城市，我们使用以下表达式：
 * 属性名称的首字母允许不区分大小写。数组和列表的内容通过使用方括号表示法获得，如以下示例所示：
 *
 * @author wpp
 */
public class InventionSpelExample1 {
    public static void main(String[] args) {
        Inventor context = Inventor.getInventor();

        ExpressionParser parser = new SpelExpressionParser();
        int year = (int) parser.parseExpression("birthdate.year + 1900").getValue(context);
        System.out.println(year);

        String city = (String) parser.parseExpression("placeOfBirth.city").getValue(context);
        System.out.println(city);

    }


}
