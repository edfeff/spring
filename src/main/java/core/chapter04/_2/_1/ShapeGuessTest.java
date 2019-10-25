package core.chapter04._2._1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeGuessTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext
                applicationContext = new ClassPathXmlApplicationContext("classpath:core/chapter04/_2/_1/ShapeGuessXmlConfiguration.xml");
        ShapeGuess bean = applicationContext.getBean(ShapeGuess.class);
        System.out.println(bean.getInitSpeed());
    }
}
