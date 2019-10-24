package core.chapter05.s5.finallyadvice;

import core.chapter05.s5.S05User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(Test.class);
        S05User bean = applicationContext.getBean(S05User.class);
        bean.say();
        //core.chapter05.s5.S05User say
        //finally after
    }

    @Bean
    public AfterFinallyExample afterFinallyExample() {
        return new AfterFinallyExample();
    }

    @Bean
    public S05User s05User() {
        return new S05User();
    }

}
