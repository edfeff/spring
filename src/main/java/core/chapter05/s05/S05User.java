package core.chapter05.s05;

import org.springframework.stereotype.Component;

@Component
public class S05User {

    public void say() {
        System.out.println(S05User.class.getName() + " say");
    }

    public String name() {
        return S05User.class.getName();
    }

    public void throwExecption() {
        throw new RuntimeException("发出一个错误");
    }
}
