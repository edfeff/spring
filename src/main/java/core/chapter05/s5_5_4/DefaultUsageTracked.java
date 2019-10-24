package core.chapter05.s5_5_4;


public class DefaultUsageTracked implements UsageTracked {
    @Override
    public void incrementUseCount() {
        System.out.println("DefaultUsageTracked incrementUseCount");
    }
}
