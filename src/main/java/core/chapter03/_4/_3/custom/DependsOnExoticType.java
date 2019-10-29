package core.chapter03._4._3.custom;

/**
 * @author wangpp
 */
public class DependsOnExoticType {
    private ExoticType type;
    private Address address;

    public ExoticType getType() {
        return type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setType(ExoticType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DependsOnExoticType{" +
                "type=" + type +
                ", address=" + address +
                '}';
    }
}
