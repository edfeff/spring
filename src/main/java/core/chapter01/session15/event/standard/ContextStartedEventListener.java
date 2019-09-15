package core.chapter01.session15.event.standard;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class ContextStartedEventListener implements ApplicationListener<ContextStartedEvent> {
    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("ContextStartedEvent ; " + event.toString() + " : " + event.getTimestamp());
    }
}
