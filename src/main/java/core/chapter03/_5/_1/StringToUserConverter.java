package core.chapter03._5._1;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

/**
 * 比较完整的字符串转成对象的实例
 *
 * @author wangpp
 */
public class StringToUserConverter implements Converter<String, User> {
    public static final String TOKEN = ",";
    private String token = TOKEN;

    private UserFactory userFactory;

    public StringToUserConverter(UserFactory userFactory) {
        this.userFactory = userFactory;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public User convert(String s) {
        if (StringUtils.isEmpty(s)) {
            throw new IllegalArgumentException("Input source should not be empty!");
        }
        String[] arr = s.split(getToken());
        if (arr.length != 2) {
            throw new IllegalArgumentException("Input source should  be <name>token<password>");
        }
        return userFactory.buildUser(arr[0], arr[1]);
    }
}
