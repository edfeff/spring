package core.chapter04._2._1;

public class TaxCalculator {
    private String userName;
    private String userLanguage;
    private String userCountry;
    private String userRegion;
    private String userTimezone;
    private String userHome;

    @Override
    public String toString() {
        return "TaxCalculator{" +
                "userName='" + userName + '\'' +
                ", userLanguage='" + userLanguage + '\'' +
                ", userCountry='" + userCountry + '\'' +
                ", userRegion='" + userRegion + '\'' +
                ", userTimezone='" + userTimezone + '\'' +
                ", userHome='" + userHome + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserRegion() {
        return userRegion;
    }

    public void setUserRegion(String userRegion) {
        this.userRegion = userRegion;
    }

    public String getUserTimezone() {
        return userTimezone;
    }

    public void setUserTimezone(String userTimezone) {
        this.userTimezone = userTimezone;
    }

    public String getUserHome() {
        return userHome;
    }

    public void setUserHome(String userHome) {
        this.userHome = userHome;
    }
}
