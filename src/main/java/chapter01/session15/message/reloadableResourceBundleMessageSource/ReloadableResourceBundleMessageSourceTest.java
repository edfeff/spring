package chapter01.session15.message.reloadableResourceBundleMessageSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class ReloadableResourceBundleMessageSourceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("chapter01/session15/message/reloadableResourceBundleMessageSource/messageResource.xml");
        String message = context.getMessage("message", null, null, null);
        System.out.println(message);
    }
}
