package core.chapter02.session5.resourceLoaderAware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ResourceLoader;

public class FiledAutowired {
    private ResourceLoader resourceLoader;
    private ApplicationContext applicationContext;

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    @Autowired
    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println(FiledAutowired.class.getName() + " ： " + resourceLoader);
        this.resourceLoader = resourceLoader;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println(FiledAutowired.class.getName() + " ： " + applicationContext);
        this.applicationContext = applicationContext;
    }
}
