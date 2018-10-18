public class Building {

    private String name;
    private String country;
    private String city;
    private int height;
    private int year;
    private int rank;

    public Building(){

    }

    public Building(String name, String country, String city, int height, int year, int rank) {
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
