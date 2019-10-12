package core.chapter05.s05.afterreturningadvice;

import core.chapter05.s05.S05User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 返回前通知
 */
@EnableAspectJAutoProxy
@Configuration
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(Test.class);
        S05User bean = applicationContext.getBean(S05User.class);
        bean.say();
        bean.name();
    }

    @Bean
    public S05User s05User() {
        return new S05User();
    }

    @Bean
    public AfterReturningExample afterReturningExample() {
        return new AfterReturningExample();
    }

    @Bean
    public GetValueAfterReturningExample getValueAfterReturningExample() {
        return new GetValueAfterReturningExample();
    }


}
