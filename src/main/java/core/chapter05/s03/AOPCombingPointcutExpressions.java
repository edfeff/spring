package core.chapter05.s03;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * PointCut 组合
 */
@Aspect
public class AOPCombingPointcutExpressions {

    @Pointcut(value = "execution(public * *(..))")
    public void publicMethodPointcut() {
    }

    @Pointcut(value = "within(core.chapter05.s03.C2)")
    public void withinPointcut() {
    }

    @Pointcut(value = "publicMethodPointcut() && withinPointcut()))")
    public void combing() {
    }


    @Before(value = "combing()")
    public void b1() {
        System.out.println("b1");
    }

}
