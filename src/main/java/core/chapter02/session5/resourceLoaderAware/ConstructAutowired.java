package core.chapter02.session5.resourceLoaderAware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ResourceLoader;

public class ConstructAutowired {
    private ResourceLoader resourceLoader;
    private ApplicationContext applicationContext;

    @Autowired
    public ConstructAutowired(ResourceLoader resourceLoader, ApplicationContext applicationContext) {
        this.resourceLoader = resourceLoader;
        this.applicationContext = applicationContext;
        System.out.println(ConstructAutowired.class.getName() + " ： " + resourceLoader);
        System.out.println(ConstructAutowired.class.getName() + " ： " + applicationContext);
    }
}
