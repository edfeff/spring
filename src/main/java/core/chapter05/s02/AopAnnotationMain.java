package core.chapter05.s02;

import core.chapter05.s01.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopAnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(AopAnnotationConfiguration.class);

        User bean = applicationContext.getBean(User.class);

        bean.hello();
        System.out.println();
        bean.throwException();
    }
}
