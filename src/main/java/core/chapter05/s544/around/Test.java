package core.chapter05.s544.around;

import core.chapter05.s544.S05User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                applicationContext = new AnnotationConfigApplicationContext(Test.class);
        S05User bean = applicationContext.getBean(S05User.class);
        bean.setName("wpp");
    }

    @Bean
    public S05User s05Use() {
        return new S05User();
    }

    @Bean
    public AroundAdviceExample aroundAdviceExample() {
        return new AroundAdviceExample();
    }
}
