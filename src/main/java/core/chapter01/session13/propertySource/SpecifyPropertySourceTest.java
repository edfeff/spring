package core.chapter01.session13.propertySource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wpp
 * @date 2019/9/14
 */
public class SpecifyPropertySourceTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getEnvironment()
                .getPropertySources()
                .addFirst(new SpecifyPropertySource("self", SpecifyPropertySource.class));
        String a = context.getEnvironment().getProperty("a");
        System.out.println(a);
    }
}
