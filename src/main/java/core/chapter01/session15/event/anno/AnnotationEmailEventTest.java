package core.chapter01.session15.event.anno;

import core.chapter01.session15.event.specify.EmailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class AnnotationEmailEventTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.send("a", "b");
    }
}
