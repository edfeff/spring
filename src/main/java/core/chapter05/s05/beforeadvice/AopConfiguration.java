package core.chapter05.s05.beforeadvice;

import core.chapter05.s05.S05User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 自动配置类
 */
@Configuration
@EnableAspectJAutoProxy
//@ComponentScan
public class AopConfiguration {
    @Bean
    public S05User s05User() {
        return new S05User();
    }

    @Bean
    public BeforeAdviceExample beforeAdviceExample() {
        return new BeforeAdviceExample();
    }
}
