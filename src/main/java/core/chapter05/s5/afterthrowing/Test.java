package core.chapter05.s5.afterthrowing;

import core.chapter05.s5.S05User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(Test.class);
        S05User bean = applicationContext.getBean(S05User.class);
        bean.throwExecption();
    }

    @Bean
    public S05User s05User() {
        return new S05User();
    }

    @Bean
    public AfterThrowingExample afterThrowingExample() {
        return new AfterThrowingExample();
    }

}
