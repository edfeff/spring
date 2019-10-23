package core.chapter05.s544.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AroundAdviceExample {
    @Pointcut(value = "execution(* core.chapter05.s544.S05User.*(..)))")
    public void p() {

    }

    @Around(value = "p()")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) {
        System.out.println("---------------start-----------------");
        try {
            before(joinPoint);
            Object proceed = joinPoint.proceed();
            after();
            return proceed;
        } catch (Throwable throwable) {
            afterThrow();
        } finally {
            afterFinally();
        }
        System.out.println("---------------end-----------------");
        return null;
    }

    private void afterThrow() {
        System.out.println("afterThrow");
    }

    private void after() {
        System.out.println("after");
    }

    /**
     * JoinPoint
     * <p>
     * <p>
     * getArgs(): Returns the method arguments. 方法参数列表
     * <p>
     * getThis(): Returns the proxy object. 代理对象
     * <p>
     * getTarget(): Returns the target object. 原始对象
     * <p>
     * getSignature(): Returns a description of the method that is being advised. 原始方法签名
     * <p>
     * toString(): Prints a useful description of the method being advised.
     *
     * @param joinPoint
     */
    private void before(ProceedingJoinPoint joinPoint) {
        System.out.println("before");
        Signature signature = joinPoint.getSignature();
        System.out.println("类型 " + signature.getDeclaringType());//class core.chapter05.s544.S05User
        System.out.println("类型 " + signature.getDeclaringTypeName());//core.chapter05.s544.S05User
        System.out.println("方法修饰符 " + signature.getModifiers());//1
        System.out.println("方法名 " + signature.getName());//setName
        System.out.println("全签名 " + signature.toString());//void core.chapter05.s544.S05User.setName(String)
        Object target = joinPoint.getTarget();
        System.out.println("target对象 " + target.toString());
        System.out.println("参数");
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg.getClass() + " " + arg);
        }


    }

    private void afterFinally() {
        System.out.println("afterFinally");
    }

}
