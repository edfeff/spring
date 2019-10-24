package core.chapter05.s5_5_3;


import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class SimpleProfiler {
    public Object profile(ProceedingJoinPoint point, String name, int age) throws Throwable {
        StopWatch clock = new StopWatch("Simple");

        try {
            clock.start(point.toShortString());
            return point.proceed();
        } finally {
            clock.stop();
            System.out.println(clock.prettyPrint());
        }
    }
}
