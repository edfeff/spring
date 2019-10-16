package core.chapter05.s05.beforeadvice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 前置通知
 */
@Aspect
@Component
public class BeforeAdviceExample {
    @Before(value = "within(core.chapter05.s05.S05User)")
    public void before() {
        System.out.println(BeforeAdviceExample.class.getName() + "before");
    }
}
