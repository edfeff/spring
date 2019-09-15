package core.chapter01.session13.propertySourceAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wpp
 * @date 2019/9/14
 */
@Configuration
@PropertySource("classpath:${my.base.package:core.chapter01/session13/propertySourceAnnotation}/app.properties")
public class PlacelholderPropertySourceAnnotationConfiguration {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(PlacelholderPropertySourceAnnotationConfiguration.class);
        System.out.println("name: " + context.getEnvironment().getProperty("name"));
        System.out.println("password: " + context.getEnvironment().getProperty("password"));
    }
}
