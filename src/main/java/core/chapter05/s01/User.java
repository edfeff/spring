package core.chapter05.s01;

public class User {
    public void hello() {
        System.out.println("user-hello");
    }

    public void throwException() {
        System.out.println("user-throwException");
        throw new RuntimeException("user-throwException");
    }
}
