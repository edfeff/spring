package core.chapter05.s03;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@ComponentScan
@EnableAspectJAutoProxy
public class AopConfiguration {

    @Bean
    public C1 c1() {
        return new C1();
    }

    @Bean
    public C2 c2() {
        return new C2();
    }

    @Bean
    public AOPCombingPointcutExpressions aopCombingPointcutExpressions() {
        return new AOPCombingPointcutExpressions();
    }
}
