package core.chapter05.s544._2._5.introductions;

/**
 * @author wangpp
 */
public class DefaultUsageTracked implements UsageTracked {
    @Override
    public void incrementUseCount() {
        System.out.println("DefaultUsageTracked");
    }
}
