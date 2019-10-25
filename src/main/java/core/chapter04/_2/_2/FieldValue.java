package core.chapter04._2._2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 若要指定默认值，可以将@Value批注放置在字段，方法以及方法或构造函数参数上。
 * 下面的示例设置字段变量的默认值：
 */
@Component
public class FieldValue {
    /**
     * 放置在成员变量上
     */
    @Value("#{systemProperties['user.name']}")
    private String defaultName;

    private String defaultHome;

    /**
     * 放置在setter方法上
     *
     * @return
     */

    @Value("#{systemProperties['user.home']}")
    public String getDefaultName() {
        return defaultName;
    }

    public String getDefaultHome() {
        return defaultHome;
    }

    public void setDefaultHome(String defaultHome) {
        this.defaultHome = defaultHome;
    }


    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    @Override
    public String toString() {
        return "FieldValue{" +
                "defaultName='" + defaultName + '\'' +
                ", defaultHome='" + defaultHome + '\'' +
                '}';
    }
}

