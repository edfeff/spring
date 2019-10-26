package core.chapter04._3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wpp
 */
public class Society {
    private String name;

    public static String Advisors = "advisors";
    public static String President = "president";

    private List<Inventor> members = new ArrayList<Inventor>();
    private Map officers = new HashMap();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getAdvisors() {
        return Advisors;
    }

    public static void setAdvisors(String advisors) {
        Advisors = advisors;
    }

    public static String getPresident() {
        return President;
    }

    public static void setPresident(String president) {
        President = president;
    }

    public List<Inventor> getMembers() {
        return members;
    }

    public void setMembers(List<Inventor> members) {
        this.members = members;
    }

    public Map getOfficers() {
        return officers;
    }

    public void setOfficers(Map officers) {
        this.officers = officers;
    }
}
