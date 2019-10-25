package core.chapter04._2._2;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 构造器参数
 *
 * @author wpp
 */
@Component
public class ConstructorValue {
    private String name;

    public ConstructorValue(@Value("#{systemProperties['user.name']}") String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConstructorValue{" +
                "name='" + name + '\'' +
                '}';
    }
}
