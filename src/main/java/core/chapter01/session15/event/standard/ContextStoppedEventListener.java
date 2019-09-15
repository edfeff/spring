package core.chapter01.session15.event.standard;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class ContextStoppedEventListener implements ApplicationListener<ContextStoppedEvent> {
    @Override
    public void onApplicationEvent(ContextStoppedEvent event) {
        System.out.println("ContextStoppedEvent ; " + event.toString() + " : " + event.getTimestamp());
    }
}
