package core.chapter04._1;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Date;
import java.util.GregorianCalendar;

//注意使用泛型方法：public T getValue（Class requiredResultType）。
//使用此方法无需将表达式的值强制转换为所需的结果类型。
//如果该值不能转换为T类型或无法使用已注册的类型转换器转换，则将引发EvaluationException。
//
//SpEL的更常见用法是提供一个针对特定对象实例（称为根对象）进行评估的表达式字符串。
// 以下示例显示如何从Inventor类的实例检索name属性或如何创建布尔条件：
public class SpelExample6 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.set(1856, 7, 9);
        Inventor tesla = new Inventor("Nikola Tesla", calendar.getTime(), "Serbian");

        ExpressionParser parser = new SpelExpressionParser();

        //从对象中取值
        Expression expression = parser.parseExpression("name");
        String value = (String) expression.getValue(tesla);
        System.out.println(value);

        expression = parser.parseExpression("name == 'Nikola Tesla'");

        Boolean result = expression.getValue(tesla, Boolean.class);
        System.out.println(result);


    }
}

class Inventor {
    private String name;
    private Date time;
    private String serial;

    public Inventor(String name, Date time, String serial) {
        this.name = name;
        this.time = time;
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
