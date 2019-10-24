package core.chapter05.s5_4_7.an_aop_example;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;

/**
 * 并发重试示例
 *
 * @author wpp
 */
@Aspect
public class ConcurrentOperationExecutor implements Ordered {
    private static final int DEFAULT_MAX_RETRIES = 2;
    private int maxRetries = DEFAULT_MAX_RETRIES;
    private int order = 1;

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * 如失败就拦截并重试此方法
     * <p>
     * 加入注解@Idempotent的方法才被拦截
     *
     * @param pjp
     * @return
     * @throws Throwable
     */
    //拦截不带注解的
//    @Around(value = "execution(* core.chapter05.s5_4_7.an_aop_example.Service.hello())")
    //拦截带注解的
    @Around(value = "execution(* core.chapter05.s5_4_7.an_aop_example.Service.*()) " +
            "&& @annotation(core.chapter05.s5_4_7.an_aop_example.Idempotent)")
    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        int numAttempts = 0;
        Throwable lockingFailureException = null;
        do {
            numAttempts++;
            try {
                System.out.println(numAttempts);
                return pjp.proceed();
            } catch (Throwable ex) {
                lockingFailureException = ex;
            }
        } while (numAttempts <= maxRetries);
        throw lockingFailureException;
    }

}
