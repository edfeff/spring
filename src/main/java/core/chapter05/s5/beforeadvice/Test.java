package core.chapter05.s5.beforeadvice;

import core.chapter05.s5.S05User;
import org.springframework.context.ApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext instance = SingletonApplicationContext.getInstance();
        S05User bean = instance.getBean(S05User.class);
        bean.say();
        /**
         * core.chapter05.s5.beforeadvice.BeforeAdviceAnnotationbefore
         * core.chapter05.s5.S05User say
         */
    }
}
