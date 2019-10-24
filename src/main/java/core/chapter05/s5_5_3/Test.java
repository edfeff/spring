package core.chapter05.s5_5_3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext
                context = new ClassPathXmlApplicationContext("classpath:core/chapter05/s5_5_3/SimpleProfilerAop.xml");

        PersonService service = (PersonService) context.getBean("service");
        Person a = service.getPerson("a", 1);
        System.out.println(a);
    }


}
