package core.chapter01.session15.event.specify;

import org.springframework.context.ApplicationListener;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class EmailEventListener implements ApplicationListener<EmailEvent> {
    @Override
    public void onApplicationEvent(EmailEvent event) {
        System.out.println("邮件事件 地址:" + event.getAddress() + " 内容: " + event.getContent());
    }
}
