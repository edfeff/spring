package core.chapter05.s5_8;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * 除了通过使用或声明配置中的各个方面外，还可以通过编程方式创建建议目标对象的代理。
 * 有关Spring的AOP API的完整详细信息，请参阅下一章。
 * <p>
 * 在这里，我们要重点介绍使用@AspectJ方面自动创建代理的功能。
 * 您可以使用org.springframework.aop.aspectj.annotation.AspectJProxyFactory类为一个或多个@AspectJ方面建议的目标对象创建代理。
 * 此类的基本用法非常简单，如以下示例所示
 * https://docs.spring.io/spring-framework/docs/5.2.0.RELEASE/javadoc-api/org/springframework/aop/aspectj/annotation/AspectJProxyFactory.html
 *
 * @author wpp
 */
public class ProgrammaticCreationAspectJProxies {
    public static void main(String[] args) {
        //1 create a factory that can generate a proxy for the given target object
//        AspectJProxyFactory factory = new AspectJProxyFactory(targetObject);

        //2 add an aspect, the class must be an @AspectJ aspect
//          you can call this as many times as you need with different aspects
//        factory.addAspect(SecurityManager.class);

        //3 you can also add existing aspect instances,
        // the type of the object supplied must be an @AspectJ aspect
//        factory.addAspect(usagrTracker);

        //4 now get the proxy object...
//        MyInterfaceType proxy = factory.getProxy();
    }
}
