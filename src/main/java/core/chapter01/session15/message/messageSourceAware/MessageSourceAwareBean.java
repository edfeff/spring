package core.chapter01.session15.message.messageSourceAware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class MessageSourceAwareBean implements MessageSourceAware {
    private String message;

    @Override
    public void setMessageSource(MessageSource messageSource) {
        message = messageSource.getMessage("message", null, "default", null);
    }

    public String getMessage() {
        return message;
    }
}
