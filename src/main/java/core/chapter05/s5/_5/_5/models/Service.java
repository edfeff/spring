package core.chapter05.s5._5._5.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wangpp
 */
@Component
@Scope( "prototype" )
public class Service {
    private int count;

    public void work() {
        System.out.println("work:" + count);
        count++;
    }
}
