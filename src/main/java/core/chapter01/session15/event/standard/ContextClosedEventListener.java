package core.chapter01.session15.event.standard;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("ContextClosedEvent ; " + event.toString() + " : " + event.getTimestamp());
    }
}
