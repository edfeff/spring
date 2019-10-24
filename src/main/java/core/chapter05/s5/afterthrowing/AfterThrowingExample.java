package core.chapter05.s5.afterthrowing;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingExample {
    @AfterThrowing(
            value = "execution(public * core.chapter05.s5.S05User.throwExecption())"
    )
    public void exceptionCaught() {
        System.out.println("exceptionCaught");
    }

    @AfterThrowing(
            value = "execution(public *  core.chapter05.s5.S05User.throwExecption())",
            throwing = "throwable"
    )
    public void getExceptionCaught(Throwable throwable) {
        System.out.println("getExceptionCaught:" + throwable.getMessage());
    }

}
