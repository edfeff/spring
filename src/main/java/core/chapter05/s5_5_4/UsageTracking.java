package core.chapter05.s5_5_4;


public class UsageTracking {
    public void readUsage(UsageTracked usageTracked) {
        System.out.println("before");
        usageTracked.incrementUseCount();
    }
}
