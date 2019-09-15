package core.chapter01.session13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author wpp
 * @date 2019/9/14
 */
public class StandardEnvironmentTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        System.out.println("=========================properties========================");
        environment.getSystemProperties().forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        System.out.println("=========================environment=========================");
        environment.getSystemEnvironment().forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
    }
}
