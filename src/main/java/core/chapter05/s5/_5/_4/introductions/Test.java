package core.chapter05.s5._5._4.introductions;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangpp
 */
@Configuration
@EnableAspectJAutoProxy
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext(Test.class);
        UsageTracked systemArchitecture = (UsageTracked) context.getBean("systemArchitecture");
        systemArchitecture.incrementUseCount();
        System.out.println(systemArchitecture.getClass());
        //DefaultUsageTracked
        //class SystemArchitecture$$EnhancerBySpringCGLIB$$e8927195s

    }

    @Bean
    public SystemArchitecture systemArchitecture() {
        return new SystemArchitecture();
    }

    @Bean
    public UsageTracked usageTracked() {
        return new DefaultUsageTracked();
    }

    @Bean
    public UsageTracking usageTracking() {
        return new UsageTracking();
    }
}
