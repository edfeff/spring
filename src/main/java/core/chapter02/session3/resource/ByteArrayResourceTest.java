package core.chapter02.session3.resource;

import org.springframework.core.io.ByteArrayResource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayResourceTest {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[1024];
        ByteArrayResource resource = new ByteArrayResource(bytes);
        ByteArrayInputStream inputStream = (ByteArrayInputStream) resource.getInputStream();
    }
}
