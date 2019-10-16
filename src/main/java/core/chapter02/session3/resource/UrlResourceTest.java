package core.chapter02.session3.resource;

import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

public class UrlResourceTest {
    public static void main(String[] args) throws IOException {
        UrlResource urlResource = new UrlResource("https://docs.spring.io/spring/docs/5.1.9.RELEASE/spring-framework-reference/pdf/core.pdf");
        System.out.println(urlResource.isFile());
        System.out.println(urlResource.exists());
        System.out.println(urlResource.getDescription());
        System.out.println(urlResource.getURI());
        System.out.println(urlResource.getURL());
    }
}
