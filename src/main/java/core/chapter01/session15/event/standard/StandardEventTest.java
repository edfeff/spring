package core.chapter01.session15.event.standard;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class StandardEventTest {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("core/chapter01/session15/event/standard/applicationStandardEvent.xml");
        Thread.sleep(100);
        context.close();
    }
}
