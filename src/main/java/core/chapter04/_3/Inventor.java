package core.chapter04._3;

import java.util.Date;

public class Inventor {
    private String name;
    private String nationality;
    private String[] inventions;
    private Date birthdate;
    private PlaceOfBirth placeOfBirth;

    public Inventor() {
    }

    public Inventor(String name, Date birthdate, PlaceOfBirth placeOfBirth) {
        this.name = name;
        this.birthdate = birthdate;
        this.placeOfBirth = placeOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String[] getInventions() {
        return inventions;
    }

    public void setInventions(String[] inventions) {
        this.inventions = inventions;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public PlaceOfBirth getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(PlaceOfBirth placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public static Inventor getInventor() {
        PlaceOfBirth placeOfBirth = new PlaceOfBirth();
        placeOfBirth.setCity("city");
        placeOfBirth.setCountry("country");


        Inventor inventor = new Inventor();
        inventor.setBirthdate(new Date());
        inventor.setName("wpp");
        inventor.setNationality("nation");
        inventor.setPlaceOfBirth(placeOfBirth);
        inventor.setInventions(new String[]{"a", "b", "c"});

        return inventor;
    }
}
