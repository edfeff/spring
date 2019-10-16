package core.chapter05.s04.sharble;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 共享切点表达式
 */
@Aspect
public class SystemArchitecture {
    /**
     * web层拦截点,任意包和子包下
     */
    @Pointcut("within(core.chapter05.s04.sharble.web..)")
    public void inWebLayer() {
    }

    /**
     * service层拦截点
     */
    @Pointcut("within(core.chapter05.s04.sharble.service..)")
    public void inServiceLayer() {
    }

    /**
     * dao层拦截点
     */
    @Pointcut("within(core.chapter05.s04.sharble.dao..)")
    public void inDataAccessLayer() {
    }

    /**
     * 全局service层拦截点
     */
    @Pointcut("execution(core.chapter05.s04..service..(..))")
//    @Pointcut("execution( com.xyz.someapp..service..(..))")
    public void businessService() {
    }

    /**
     * dao层拦截点
     */
    @Pointcut("execution(core.chapter05.s04..dao..(..))")
    //    @Pointcut("execution( com.xyz.someapp.dao..(..))")
    public void dataAccessOperation() {
    }
}
