package core.chapter05.s02;

import core.chapter05.s01.User;
import core.chapter05.s01.UserAop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 注解开启AOP配置
 *
 * @author wpp
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class AopAnnotationConfiguration {
    @Bean
    public User user() {
        return new User();
    }

    @Bean
    public UserAop userAop() {
        return new UserAop();
    }
}
