package core.chapter05.s544._2._5.introductions;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @author wangpp
 */
@Aspect
public class UsageTracking {
    @DeclareParents( value = "core.chapter05.s544._2._5.introductions.*+", defaultImpl = DefaultUsageTracked.class )
    public static UsageTracked mixin;

    @Before( "execution(* core.chapter05.s544._2._5.introductions.SystemArchitecture.hello() )&& this(usageTracked)" )
    public void readUsage(UsageTracked usageTracked) {
        System.out.println("before");
        usageTracked.incrementUseCount();
    }
}
