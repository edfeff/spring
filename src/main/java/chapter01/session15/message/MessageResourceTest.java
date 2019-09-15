package chapter01.session15.message;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class MessageResourceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:/chapter01/session15/message/messageResource.xml");
        String message = context.getMessage("message", null, "defaultMessage", null);
        System.out.println(message);
    }
}
