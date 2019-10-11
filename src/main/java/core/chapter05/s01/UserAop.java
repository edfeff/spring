package core.chapter05.s01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面对象
 */
@Aspect
public class UserAop {
    /**
     * execution表达式 如果表达式不正确会抛出 Xlint:invalidAbsoluteTypeName] 异常
     */
    @Pointcut(value = "execution(public * core.chapter05.s01.*.*(..))")
    public void userEndpoint() {

    }

    @Before(value = "userEndpoint()")
    public void before() {
        System.out.println("2 before-before");
    }

    @After(value = "userEndpoint()")
    public void after() {
        System.out.println("5 after-after");
    }

    @Around(value = "userEndpoint()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        try {
            System.out.println("1 around-before");
            point.proceed();
            System.out.println("3 around-after");

        } catch (Throwable throwable) {
            System.out.println("around-exception");
            throw throwable;
        } finally {
            System.out.println("4 around-finally");
        }

    }

    @AfterThrowing(value = "userEndpoint()", throwing = "e")
    public void executionCaught(Throwable e) {
        System.out.println("exception:" + e.getMessage());

    }
}
