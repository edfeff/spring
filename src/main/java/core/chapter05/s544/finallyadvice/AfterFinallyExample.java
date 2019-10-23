package core.chapter05.s544.finallyadvice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AfterFinallyExample {
    @Pointcut(value = "execution(* core.chapter05.s544.S05User.*(..))")
    public void p() {

    }

    @After(value = "p()")
    public void afterFinally() {
        System.out.println("finally after");
    }

}
