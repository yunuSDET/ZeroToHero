package session19.ex4person;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPerson {

    public static void main(String[] args) {

        Person person1 = new Person("yunus", "kulcu", 38);
        Person person2 = new Person("ayse", "kaya", 19);
        Person person3 = new Person("ali", "koyu", 28);
        Person person4 = new Person("filiz", "kahraman", 16);
        Person person5 = new Person("burak", "ay", 24);

        ArrayList<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5));

        //First solution
        for (Person each : persons) {
            if (each.age > 25) System.out.println(each);
        }


        System.out.println("-".repeat(100));


        //Second solution
        persons.stream().filter(i -> i.age > 25).forEach(System.out::println);

    }
}
