package core.chapter05.s544.generics;

import java.util.Collection;

/**
 * @author wangpp
 */
public class SampleImpl implements Sample<Integer> {
    @Override
    public void sampleGenericMethod(Integer param) {
        System.out.println("sampleGenericMethod " + param);
    }

    @Override
    public void sampleGenericCollectionMethod(Collection<Integer> param) {
        System.out.println("sampleGenericCollectionMethod " + param);
    }
}
