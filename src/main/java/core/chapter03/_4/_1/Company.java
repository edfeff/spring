package core.chapter03._4._1;

/**
 * @author wangpp
 */
public class Company {
    private String name;
    private Employee managingDirector;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManagingDirector() {
        return this.managingDirector;
    }

    public void setManagingDirector(Employee managingDirector) {
        this.managingDirector = managingDirector;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", managingDirector=" + managingDirector +
                '}';
    }
}