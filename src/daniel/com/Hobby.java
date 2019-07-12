package daniel.com;

import java.util.List;

public class Hobby {

    private String hobbyName;
    private int frequency;
    private List<Adress> address;


    public Hobby(String hobbyName, int frequency, List<Adress> adress) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.address = adress;
    }

    public List<Adress> getAddress() {
        return address;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    @Override
    public String toString() {
        return "hobbyName='" + hobbyName + '\'' +
                ", address=" + address +
                '}';
    }
}
