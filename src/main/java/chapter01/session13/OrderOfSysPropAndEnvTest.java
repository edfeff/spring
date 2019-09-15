package chapter01.session13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wpp
 * @date 2019/9/14
 */
public class OrderOfSysPropAndEnvTest {
    public static void main(String[] args) {
        System.getProperties().put("M2_HOME", "test.prop");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        String property = context.getEnvironment().getProperty("M2_HOME");
        System.out.println("getProperty: " + property);
        System.out.println("getSystemEnvironment: " + context.getEnvironment().getSystemEnvironment().get("M2_HOME"));
        System.out.println("getSystemProperties: " + context.getEnvironment().getSystemProperties().get("M2_HOME"));
    }
}
