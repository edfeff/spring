package core.chapter01.session15.event.anno;

import core.chapter01.session15.event.specify.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wpp
 * @date 2019/9/15
 */
@Configuration
public class AnnotationConfiguration {
    @Bean
    public AnnotationEmailEventListener annotationEmailEventListener() {
        return new AnnotationEmailEventListener();
    }

    @Bean
    public EmailService emailService() {
        return new EmailService();
    }

    @Bean
    public AnnotationEventListener annotationEventListener() {
        return new AnnotationEventListener();
    }
}
