package core.chapter01.session15.event.anno;

import core.chapter01.session15.event.specify.EmailEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class AnnotationEmailEventListener {
    @EventListener
    public void onApplicationEvent(EmailEvent event) {
        System.out.println("@注解 邮件事件 地址:" + event.getAddress() + " 内容: " + event.getContent());
    }
}
