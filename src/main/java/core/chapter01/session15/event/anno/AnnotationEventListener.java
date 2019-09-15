package core.chapter01.session15.event.anno;

import core.chapter01.session15.event.specify.EmailEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class AnnotationEventListener {
    @EventListener({ContextStartedEvent.class, ContextRefreshedEvent.class})
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("@注解事件" + event.toString());
    }
}
