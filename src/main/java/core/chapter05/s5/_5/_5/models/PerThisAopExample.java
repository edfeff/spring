package core.chapter05.s5._5._5.models;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * perthis 生命周期
 * 类似的 pertarget
 * TODO 没有成功
 *
 * @author wangpp
 */
@Aspect( "perthis(Service.work())" )
@Configuration
//@Aspect
public class PerThisAopExample {
    private int someState = 0;

    //    @Before( "execution(* Service.work())" )
    @Before( "p()" )
    public void recodeService() {
        System.out.println("before：" + someState);
        someState++;
    }

    @Pointcut( value = "execution(public * *(..))" )
//    @Pointcut( "execution(public void Service.work())" )
    public void p() {

    }
}
