package core.chapter05.s544.beforeadvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试专用的单例ApplicationContext
 *
 * @author wpp
 */
public class SingletonApplicationContext {
    private SingletonApplicationContext() {
    }

    private static class ApplicationContextHolder {
        static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfiguration.class);
    }

    public static ApplicationContext getInstance() {
        return ApplicationContextHolder.context;
    }
}
