package core.chapter05.s544.afterreturning;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * 获取切入方法的返回值
 */
@Aspect
public class GetValueAfterReturningExample {
    @AfterReturning(
            value = "execution(public String  core.chapter05.s544.S05User.name())",
            returning = "result")
    public void getReturningValue(String result) {
        System.out.println(GetValueAfterReturningExample.class.getName() + ":" + result);
    }
}
