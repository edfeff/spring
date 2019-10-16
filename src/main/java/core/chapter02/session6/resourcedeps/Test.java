package core.chapter02.session6.resourcedeps;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("core/chapter02/session6/resourcedeps/resource.xml");
        ResourceDependency resourceDependency = applicationContext.getBean("resourceDependency", ResourceDependency.class);
        System.out.println(resourceDependency.getResource().getClass().getName());
        System.out.println(resourceDependency.getResource().getURL());
        System.out.println(resourceDependency.getClasspathResource().getClass().getName());
        System.out.println(resourceDependency.getClasspathResource().getURL());
    }
}
