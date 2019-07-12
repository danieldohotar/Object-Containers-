package daniel.com;

public class Country {
    String name;

    public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
