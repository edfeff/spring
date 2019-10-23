package core.chapter05.s544._2._6.models;

import org.springframework.context.annotation.*;

/**
 * aop 实例默认是单例的，可以通过
 * <p>
 * prethis 和pretarget进行生命周期修改
 *
 * @author wangpp
 */
@Configuration
@ComponentScan( basePackages = "core.chapter05.s544._2._6.models" )
@EnableAspectJAutoProxy
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext(Test.class);
        Service bean = context.getBean(Service.class);
        bean.work();
        Service bean2 = context.getBean(Service.class);
        bean2.work();
    }
}
