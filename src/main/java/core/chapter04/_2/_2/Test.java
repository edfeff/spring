package core.chapter04._2._2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext
                context = new AnnotationConfigApplicationContext(Test.class);
        FieldValue fieldValue = context.getBean(FieldValue.class);
        PropertiesValue propertiesValue = context.getBean(PropertiesValue.class);
        MethodValue methodValue = context.getBean(MethodValue.class);
        ConstructorValue constructorValue = context.getBean(ConstructorValue.class);
        System.out.println(fieldValue);
        System.out.println(propertiesValue);
        System.out.println(methodValue);
        System.out.println(constructorValue);

    }
}
