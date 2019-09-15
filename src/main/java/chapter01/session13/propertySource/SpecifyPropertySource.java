package chapter01.session13.propertySource;


import org.springframework.core.env.PropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wpp
 * @date 2019/9/14
 */
public class SpecifyPropertySource extends PropertySource {
    static final Map<String, Object> map;

    static {
        map = new HashMap<String, Object>() {
            {
                put("a", "A");
                put("b", "B");
            }
        };

    }

    public SpecifyPropertySource(String name, Object source) {
        super(name, source);
    }

    @Override
    public Object getProperty(String name) {
        return map.get(name);
    }
}
