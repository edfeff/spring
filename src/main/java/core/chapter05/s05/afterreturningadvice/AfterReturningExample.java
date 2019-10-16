package core.chapter05.s05.afterreturningadvice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningExample {
    @AfterReturning(value = "within(core.chapter05.s05.S05User)")
    public void after() {
        System.out.println(AfterReturningExample.class.getName());
    }
}

