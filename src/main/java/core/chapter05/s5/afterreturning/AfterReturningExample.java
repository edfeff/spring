package core.chapter05.s5.afterreturning;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningExample {
    @AfterReturning(value = "within(core.chapter05.s5.S05User)")
    public void after() {
        System.out.println(AfterReturningExample.class.getName());
    }
}

