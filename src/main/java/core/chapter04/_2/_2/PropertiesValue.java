package core.chapter04._2._2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 属性上
 *
 * @author wpp
 */
@Component
public class PropertiesValue {
    private String defaultHome;

    /**
     * 放置在setter方法上
     */
    @Value("#{systemProperties['user.home']}")
    public void setDefaultHome(String defaultHome) {
        this.defaultHome = defaultHome;
    }

    public String getDefaultHome() {
        return defaultHome;
    }

    @Override
    public String toString() {
        return "PropertiesValue{" +
                "defaultHome='" + defaultHome + '\'' +
                '}';
    }
}
