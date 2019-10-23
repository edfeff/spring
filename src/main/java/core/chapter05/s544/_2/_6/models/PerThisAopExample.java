package core.chapter05.s544._2._6.models;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * perthis 生命周期
 * 类似的 pertarget
 * TODO 没有成功
 *
 * @author wangpp
 */
@Aspect( "perthis(core.chapter05.s544._2._6.models.Service.work())" )
@Configuration
//@Aspect
public class PerThisAopExample {
    private int someState = 0;

    //    @Before( "execution(* core.chapter05.s544._2._6.models.Service.work())" )
    @Before( "p()" )
    public void recodeService() {
        System.out.println("before：" + someState);
        someState++;
    }

    @Pointcut( value = "execution(public * *(..))" )
//    @Pointcut( "execution(public void core.chapter05.s544._2._6.models.Service.work())" )
    public void p() {

    }
}
