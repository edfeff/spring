package core.chapter05.s5_5_1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext
                context = new ClassPathXmlApplicationContext("classpath:core/chapter05/s5_5_1/DeclaringAnAspect.xml");
        Service service = (Service) context.getBean("service");
        service.hello();
    }

}
