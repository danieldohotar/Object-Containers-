package daniel.com;

public class Person {

    private String name;
    private int age;
    private String cnp;

    public Person(String name, int age, String cnp) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Person)) return false;
        Person person = (Person) object;
        return age == person.age &&
                name.equals(person.name) &&
                cnp.equals(person.cnp);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cnp='" + cnp;
    }
}
