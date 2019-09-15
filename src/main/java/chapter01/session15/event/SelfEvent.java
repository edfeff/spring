package chapter01.session15.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class SelfEvent extends ApplicationEvent {
    private final String address;
    private final String content;

    public SelfEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }
}
