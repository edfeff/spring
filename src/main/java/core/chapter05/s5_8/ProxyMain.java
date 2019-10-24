package core.chapter05.s5_8;

import org.springframework.aop.framework.ProxyFactory;

public class ProxyMain {
    public static void main(String[] args) {
//        m1();
//        最后，必须注意，AspectJ没有此自调用问题，因为它不是基于代理的AOP框架
//        为了解决代理自调用的问题。需要如下操作
        m2();


    }

    private static void m2() {
        ProxyFactory factory = new ProxyFactory(new SimplePojo());
        factory.addInterface(Pojo.class);
        factory.addAdvice(new RetryAdvice());
        //
        factory.setExposeProxy(true);

        Pojo pojo = (Pojo) factory.getProxy();
        // this is a method call on the proxy!
        pojo.foo();
    }


    private static void m1() {
        ProxyFactory factory = new ProxyFactory(new SimplePojo());
        factory.addInterface(Pojo.class);
        factory.addAdvice(new RetryAdvice());
        Pojo pojo = (Pojo) factory.getProxy();
        // this is a method call on the proxy!
        pojo.foo();
    }
}
