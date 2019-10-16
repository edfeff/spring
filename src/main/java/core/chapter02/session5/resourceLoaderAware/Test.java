package core.chapter02.session5.resourceLoaderAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(Config.class);
    }
}

@Configuration
class Config {

    @Bean
    public MyApplicationContextAwareImpl myApplicationContextAware() {
        return new MyApplicationContextAwareImpl();
    }

    @Bean
    public MyResourceLoaderAwareImpl myResourceLoaderAware() {
        return new MyResourceLoaderAwareImpl();
    }

    @Bean
    public FiledAutowired filedAutowired() {
        return new FiledAutowired();
    }

    @Bean
    public ConstructAutowired constructAutowired(ResourceLoader resourceLoader, ApplicationContext applicationContext) {
        return new ConstructAutowired(resourceLoader, applicationContext);
    }

}
