package core.chapter05.s5_5_7;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 既然您已经了解了所有组成部分是如何工作的，那么我们可以将它们放在一起做一些有用的事情。
 * <p>
 * 有时由于并发问题（例如，死锁失败者），业务服务的执行可能会失败。 如果重试该操作，则很可能在下一次尝试中成功。 对于适合在这种情况下重试的业务（不需要为解决冲突而需要返回给用户的幂等操作），我们希望透明地重试该操作，以避免客户端看到PessimisticLockingFailureException。 这项要求明确地跨越了服务层中的多个服务，因此非常适合通过一个方面实施。
 * <p>
 * 因为我们想重试该操作，所以我们需要使用周围建议，以便可以多次调用proced。 以下清单显示了基本方面的实现：
 *
 * @author wpp
 */
//@Configuration
//@EnableAspectJAutoProxy
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:core/chapter05/s5_5_7/AnAopExample.xml");
        Service bean = context.getBean(Service.class);
//        bean.hello();
        bean.re();
    }

}
