package core.chapter05.s5_5_7;

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
