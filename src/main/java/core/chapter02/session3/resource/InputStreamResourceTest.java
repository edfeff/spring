package core.chapter02.session3.resource;

import org.springframework.core.io.InputStreamResource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamResourceTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("");
        InputStreamResource resource = new InputStreamResource(fileInputStream);
        System.out.println(resource.exists());
    }
}
