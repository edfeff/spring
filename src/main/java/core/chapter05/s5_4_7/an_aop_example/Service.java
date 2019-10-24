package core.chapter05.s5_4_7.an_aop_example;

import org.springframework.dao.PermissionDeniedDataAccessException;

public class Service {
    public void hello() {
        System.out.println("hello");
        throw new PermissionDeniedDataAccessException("hello", null);
    }

    @Idempotent
    public void re() {
        System.out.println("re");
        throw new PermissionDeniedDataAccessException("re", null);
    }
}
