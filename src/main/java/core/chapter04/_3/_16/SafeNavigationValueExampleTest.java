package core.chapter04._3._16;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SafeNavigationValueExampleTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext(SafeNavigationValueExampleTest.class);

        SafeNavigationValueExample bean = context.getBean(SafeNavigationValueExample.class);
        System.out.println(bean);

    }
}
