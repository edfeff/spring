package core.chapter01.session15.message.placeholder;

import org.springframework.context.MessageSource;

/**
 * @author wpp
 * @date 2019/9/15
 */
public class Example {
    private MessageSource messages;

    public void setMessages(MessageSource messages) {
        this.messages = messages;
    }

    public void execute() {
        String message = this.messages.getMessage("argument.required", new Object[]{"userDao"}, "Required", null);
        System.out.println(message);
    }
}
