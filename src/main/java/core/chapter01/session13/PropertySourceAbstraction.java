package core.chapter01.session13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author wpp
 * @date 2019/9/13
 */
public class PropertySourceAbstraction {
    public static void main(String[] args) {
        ApplicationContext ctx = new GenericApplicationContext();
        Environment env = ctx.getEnvironment();
        boolean containsMyProperty = env.containsProperty("my-property");
        System.out.println("Does my environment contain the 'my-property' property? " +
                containsMyProperty);
    }
}
