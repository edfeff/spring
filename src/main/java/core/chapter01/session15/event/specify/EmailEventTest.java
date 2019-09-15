package core.chapter01.session15.event.specify;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class EmailEventTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("core/chapter01/session15/event/specify/applicationContext.xml");
        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.send("22@qq.com", "你好");
    }
}
