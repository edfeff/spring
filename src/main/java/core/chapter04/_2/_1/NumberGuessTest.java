package core.chapter04._2._1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NumberGuessTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext
                applicationContext = new ClassPathXmlApplicationContext("classpath:core/chapter04/_2/_1/NumberGuessXmlConfiguration.xml");
        NumberGuess bean = applicationContext.getBean(NumberGuess.class);
        System.out.println(bean.getRandomNumber());
    }
}
