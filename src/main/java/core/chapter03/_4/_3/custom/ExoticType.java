package core.chapter03._4._3.custom;

/**
 * @author wangpp
 */
public class ExoticType {
    private String name;

    public ExoticType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExoticType{" +
                "name='" + name + '\'' +
                '}';
    }
}
