package core.chapter03._5._1;

/**
 * @author wangpp
 */
public class DefaultUserFactory implements UserFactory {
    @Override
    public User buildUser(String name, String password) {
        return new User(name, password);
    }
}
