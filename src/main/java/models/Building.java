package models;

public class Building {

    private String name;
    private String country;
    private String city;
    private String height;
    private String year;
    private String rank;

    public Building(){

    }

    public Building(String name, String country, String city, String height, String year, String rank) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.height = height;
        this.year = year;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString(){
        return "building: " + getName() + ", city: " + getCity() + ", height: " + getHeight();

    }
}
