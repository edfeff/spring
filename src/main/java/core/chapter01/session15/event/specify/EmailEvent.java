package core.chapter01.session15.event.specify;

import org.springframework.context.ApplicationEvent;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class EmailEvent extends ApplicationEvent {
    private final String address;
    private final String content;

    public EmailEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public String getContent() {
        return content;
    }
}
