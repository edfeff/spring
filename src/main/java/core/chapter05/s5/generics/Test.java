package core.chapter05.s5.generics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//TODO
//文档246页，没有测试出来,关于AOP泛型的

/**
 * @author wangpp
 */
@Configuration
@EnableAspectJAutoProxy
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext(Test.class);

        Sample bean = context.getBean(Sample.class);
        bean.sampleGenericMethod(1);
    }

    @Bean
    public Sample<Integer> sample() {
        return new SampleImpl();
    }

    @Bean
    public GenericAdvice genericAdvice() {
        return new GenericAdvice();
    }

}
