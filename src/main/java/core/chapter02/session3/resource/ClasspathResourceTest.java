package core.chapter02.session3.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;

public class ClasspathResourceTest {
    public static void main(String[] args) throws IOException {
        ClassPathResource resource1 = new ClassPathResource("resource.properties");
        ClassPathResource resource2 = new ClassPathResource("resource.properties", Thread.currentThread().getContextClassLoader());
        ClassPathResource resource3 = new ClassPathResource("resource.properties", ClasspathResourceTest.class.getClassLoader());
        ClassPathResource resource4 = new ClassPathResource("resource.properties", ClasspathResourceTest.class);

        System.out.println(resource1.getURI());
        System.out.println(resource2.getURI());
        System.out.println(resource3.getURI());
        System.out.println(resource4.getURI());

//        file:/home/wpp/work/20190918/spring/target/classes/resource.properties
//        file:/home/wpp/work/20190918/spring/target/classes/resource.properties
//        file:/home/wpp/work/20190918/spring/target/classes/resource.properties
//        file:/home/wpp/work/20190918/spring/target/classes/core/chapter02/session3/resource/resource.properties
    }
}
