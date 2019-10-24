package core.chapter05.s5.generics;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author wangpp
 */
@Aspect
public class GenericAdvice {
    @Before( value = "execution(public * core.chapter05.s5.generics.SampleImpl(*))" )
    public void p() {
        System.out.println("before");
    }

    @Before( value = "execution(public * *.generics.Sample+.sampleGenericMethod(*)) && args(param)" )
    public void before(Integer param) {
        System.out.println("before " + param);
    }
}
