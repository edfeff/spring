package core.chapter03._4._3.custom;

/**
 * @author wangpp
 */
public class Address {
    private String name;
    private String gate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", gate='" + gate + '\'' +
                '}';
    }
}
