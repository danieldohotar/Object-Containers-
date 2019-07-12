package daniel.com;

public class Adress {
    private Country country;
    private String cityName;
    private String streetName;
    private int streetNumber;

    public Adress(Country countryName, String cityName, String streetName, int streetNumber) {

        this.country = countryName;
        this.cityName = cityName;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", cityName='" + cityName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
