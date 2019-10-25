package core.chapter04._2._2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class FieldValueTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext(FieldValueTest.class);
        FieldValue bean = context.getBean(FieldValue.class);
        System.out.println(bean);
    }

}
