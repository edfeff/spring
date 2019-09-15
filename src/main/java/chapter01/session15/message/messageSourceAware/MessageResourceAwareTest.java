package chapter01.session15.message.messageSourceAware;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class MessageResourceAwareTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("classpath:chapter01/session15/message/messageSourceAware/messageResource.xml");
        MessageSourceAwareBean messageSourceAwareBean = context.getBean("messageSourceAwareBean", MessageSourceAwareBean.class);
        System.out.println(messageSourceAwareBean.getMessage());
    }
}
