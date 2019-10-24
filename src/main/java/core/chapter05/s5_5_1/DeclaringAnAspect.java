package core.chapter05.s5_5_1;


import org.aspectj.lang.ProceedingJoinPoint;

public class DeclaringAnAspect {
    public void before() {
        System.out.println("before");
    }

    public void after() {
        System.out.println("after");
    }

    public void around(ProceedingJoinPoint point) {
        System.out.println("around==1");
        try {
            point.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around==2");
    }
}
