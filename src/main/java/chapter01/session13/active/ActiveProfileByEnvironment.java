package chapter01.session13.active;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

/**
 * 通过Environment接口激活指定的profile
 *
 * @author wpp
 * @date 2019/9/13
 */
public class ActiveProfileByEnvironment {
    public static void main(String[] args) {
//        xmlProfile();
        annotationProfile();
    }

    private static void annotationProfile() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("prod", "production");
    }

    private static void xmlProfile() {
        ApplicationContext context = new ClassPathXmlApplicationContext("");
        ConfigurableEnvironment environment = (ConfigurableEnvironment) context.getEnvironment();
        environment.setActiveProfiles("prod", "production");
    }
}
