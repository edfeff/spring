package core.chapter04._2._1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext
                applicationContext = new ClassPathXmlApplicationContext("classpath:core/chapter04/_2/_1/TaxCalculatorXmlConfiguration.xml");
        TaxCalculator bean = applicationContext.getBean(TaxCalculator.class);
        System.out.println(bean);
    }
}
