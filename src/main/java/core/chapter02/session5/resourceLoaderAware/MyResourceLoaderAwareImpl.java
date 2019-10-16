package core.chapter02.session5.resourceLoaderAware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class MyResourceLoaderAwareImpl implements ResourceLoaderAware {
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println(MyResourceLoaderAwareImpl.class.getName() + " : " + resourceLoader);
    }
}
