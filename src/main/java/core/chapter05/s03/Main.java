package core.chapter05.s03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AopConfiguration.class);
        C1 c1 = context.getBean(C1.class);
        C2 c2 = context.getBean(C2.class);

        c1.m1();
        c1.m2();
        c1.m3();

        c2.m1();
        c2.m2();
        c2.m3();


    }
}
