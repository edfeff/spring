package core.chapter05.s5._5._4.introductions;

/**
 * @author wangpp
 */
public class DefaultUsageTracked implements UsageTracked {
    @Override
    public void incrementUseCount() {
        System.out.println("DefaultUsageTracked");
    }
}
