package core.chapter02.session4.resourcesLoader;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class DifferentApplicationContextAndResourceLoader {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test3() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.refresh();
        Resource fileResource = applicationContext.getResource("file:a/b/c");
        Resource httpResource = applicationContext.getResource("http:a/b/c");
        System.out.println(fileResource.getClass().getName());
        System.out.println(httpResource.getClass().getName());

    }

    private static void test2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.refresh();
        Resource resource = applicationContext.getResource("classpath:a/b/c");
        System.out.println(resource.getClass().getName());

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.refresh();
        Resource resource1 = annotationConfigApplicationContext.getResource("classpath:a/b/c");
        System.out.println(resource1.getClass().getName());

        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext();
        fileSystemXmlApplicationContext.refresh();
        Resource resource2 = fileSystemXmlApplicationContext.getResource("classpath:a/b/c");
        System.out.println(resource2.getClass().getName());

    }

    private static void test1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.refresh();
        Resource resource = applicationContext.getResource("a/b/c");
        System.out.println(resource.getClass().getName());

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.refresh();
        Resource resource1 = annotationConfigApplicationContext.getResource("a/b/c");
        System.out.println(resource1.getClass().getName());

        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext();
        fileSystemXmlApplicationContext.refresh();
        Resource resource2 = fileSystemXmlApplicationContext.getResource("a/b/c");
        System.out.println(resource2.getClass().getName());

    }
}
