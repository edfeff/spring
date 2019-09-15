package core.chapter01.session15.message.placeholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class ExampleMessageSourceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:core/chapter01/session15/message/placeholder/messageResource.xml");
        Example example = context.getBean("example", Example.class);
        example.execute();
    }
}
