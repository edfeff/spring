package core.chapter05.s5_5_4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext
                context = new ClassPathXmlApplicationContext("classpath:core/chapter05/s5_5_4/introduction-aop.xml");

        //Service的类型是是SystemArchitecture，但是通过introduction技术，却可以转化成为UsageTracked接口的实现类
        //并且接口的实现方式是外部注入的一个实现类，与原有的类无关
        UsageTracked service = (UsageTracked) context.getBean("service");

        service.incrementUseCount();

//        讲类转化成为原有的类型
        ((SystemArchitecture) service).hello();
    }
}
