package daniel.com;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Adress> adressBasketball = new ArrayList<>();
        List<Adress> adressTennis = new ArrayList<>();
        List<Adress> adressFotball = new ArrayList<>();
        List<Adress> adressTableTennis = new ArrayList<>();
        List<Adress> adressSwiming = new ArrayList<>();
        List<Hobby> p1Hobbies = new ArrayList<>();
        List<Hobby> p2Hobbies = new ArrayList<>();
        List<Hobby> p3Hobbies = new ArrayList<>();
        Map<Person, List<Hobby>> persAndHobby = new HashMap<>();


        Person p1 = new Unemployed("Dani", 18, "119273398");
        Person p2 = new Employed("Adi", 19, "119277345");
        Person p3 = new Student("Elena", 23, "224823493");

        System.out.println();
        System.out.println("---Sortarea pe baza de nume---");

        Set<Person> treeMapPersName = new TreeSet<>(Comparator.comparing(Person::getName));
        treeMapPersName.add(p1);
        treeMapPersName.add(p3);
        treeMapPersName.add(p2);

        for (Person person : treeMapPersName) {
            System.out.println(person.getName());
        }

        System.out.println();
        System.out.println("---Sortarea pe baza de varsta---");

        Set<Person> treeMapPersAge = new TreeSet<>(Comparator.comparing(Person::getAge));
        treeMapPersAge.add(p1);
        treeMapPersAge.add(p3);
        treeMapPersAge.add(p2);

        for (Person person : treeMapPersAge) {
            System.out.println(person.getAge());
        }

        Country romania = new Country("Romania");
        Country switzerland = new Country("Switzerland");
        Country france = new Country("France");
        Country italy = new Country("Italy");
        Country germany = new Country("Germany");

        Adress adress1 = new Adress(romania, "Radauti", "Mihia VIteazul", 3);
        Adress adress2 = new Adress(italy, "Roma", "Via Sacra", 23);
        Adress adress3 = new Adress(france, "Paris", "Avenue de L'Opéra", 12);
        Adress adress4 = new Adress(romania, "Cluj", "Armoniei", 4);
        Adress adress5 = new Adress(switzerland, "Lausanne", "Closelet", 14);
        Adress adress6 = new Adress(germany, "Mannheim", "Zeist", 45);

        adressTennis.add(adress5);
        adressTennis.add(adress2);
        adressTennis.add(adress4);

        adressSwiming.add(adress1);
        adressSwiming.add(adress4);
        adressSwiming.add(adress6);

        adressFotball.add(adress1);
        adressFotball.add(adress3);
        adressFotball.add(adress5);

        adressBasketball.add(adress6);
        adressBasketball.add(adress3);
        adressBasketball.add(adress4);

        adressTableTennis.add(adress2);
        adressTableTennis.add(adress3);
        adressTableTennis.add(adress5);

        Hobby basketball = new Hobby("Basketball", 2, adressBasketball);
        Hobby fotball = new Hobby("Fotball", 3, adressFotball);
        Hobby tennis = new Hobby("Tennis", 5, adressTennis);
        Hobby swiming = new Hobby("Swiming", 3, adressSwiming);
        Hobby tableTennis = new Hobby("Table Tennis", 6, adressTableTennis);

        p1Hobbies.add(basketball);
        p1Hobbies.add(fotball);
        p1Hobbies.add(tennis);

        p2Hobbies.add(swiming);
        p2Hobbies.add(fotball);
        p2Hobbies.add(tableTennis);

        p3Hobbies.add(basketball);
        p3Hobbies.add(swiming);
        p3Hobbies.add(tennis);


        persAndHobby.put(p1, p1Hobbies);
        persAndHobby.put(p2, p2Hobbies);
        persAndHobby.put(p3, p3Hobbies);

        System.out.println();
        System.out.println("---Sortarea pe baza de hobby-uri");
        System.out.println(p1.getName() + ": with hobbies below: ");
        for (int i = 0; i < p1Hobbies.size(); i++) {
            System.out.println("The hobby name is:- " + p1Hobbies.get(i).getHobbyName() + ", and you can play it in- " + p1Hobbies.get(i).getAddress().get(i).getCountry());
        }
    }
}
