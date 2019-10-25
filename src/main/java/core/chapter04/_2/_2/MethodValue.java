package core.chapter04._2._2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 方法参数
 *
 * @author wpp
 */
@Component
public class MethodValue {
    private String name;

    @Autowired
    public void configure(@Value("#{systemProperties['user.name']}") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MethodValue{" +
                "name='" + name + '\'' +
                '}';
    }
}

