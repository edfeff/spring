package chapter01.session15.message.i18n;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class MessageSourceTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:chapter01/session15/message/i18n/messageResource.xml");
        System.out.println(" default : " + context.getMessage("message", null, null, null));
        System.out.println(" uk : " + context.getMessage("message", null, null, Locale.UK));
        System.out.println(" us : " + context.getMessage("message", null, null, Locale.US));
        System.out.println(" cn : " + context.getMessage("message", null, null, Locale.CHINA));
    }
}
