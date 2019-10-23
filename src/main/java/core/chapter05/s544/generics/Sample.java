package core.chapter05.s544.generics;

import java.util.Collection;

/**
 * @author wangpp
 */
public interface Sample<T> {
    void sampleGenericMethod(T param);

    void sampleGenericCollectionMethod(Collection<T> param);
}
