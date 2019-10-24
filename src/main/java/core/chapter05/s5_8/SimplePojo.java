package core.chapter05.s5_8;

import org.springframework.aop.framework.AopContext;

public class SimplePojo implements Pojo {
    @Override
    public void foo() {
//        使用this指针，当被代理时，此时的this就是代理类的指针
        // this next method invocation is a direct call on the 'this' reference
        System.out.println("foo");
        this.bar();
//        如果需要使用被代理类的指针，则使用下面的方法
//        这将您的代码完全耦合到Spring AOP，并且使类本身意识到在AOP上下文中使用它的事实，而AOP上下文却是这样
        ((Pojo) AopContext.currentProxy()).bar();
    }

    @Override
    public void bar() {
        // some logic...
        System.out.println("bar");
    }
}
