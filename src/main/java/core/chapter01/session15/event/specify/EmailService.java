package core.chapter01.session15.event.specify;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class EmailService implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    /**
     * 发送邮件 并发送事件
     *
     * @param address
     * @param content
     */
    public void send(String address, String content) {
        System.out.println("send email");
        applicationEventPublisher.publishEvent(new EmailEvent(this, address, content));
    }
}
