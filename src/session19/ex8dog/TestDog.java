package session19.ex8dog;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDog {

    public static void main(String[] args) {


        Dog dog1 = new Dog("dog1", 1, 'M');
        Dog dog2 = new Dog("dog2", 8, 'F');
        Dog dog3 = new Dog("dog3", 3, 'M');
        Dog dog4 = new Dog("dog4", 6, 'F');
        Dog dog5 = new Dog("dog5", 3, 'M');
        Dog dog6 = new Dog("dog6", 9, 'F');

        ArrayList<Dog> dogs = new ArrayList<>(Arrays.asList(dog1, dog2, dog3, dog4, dog5, dog6));


        //First solution
        System.out.println("First solution");
        for (Dog each : dogs) {
            if(each.age>6) each.bark();
        }

        for (Dog each : dogs) {
            if (each.gender=='F') System.out.println(each);
        }


        System.out.println("-".repeat(100));



        //Second solution
        System.out.println("Second solution");
        dogs.stream().filter(i -> i.age > 6).forEach(Dog::bark);
        dogs.stream().filter(i -> i.gender == 'F').forEach(System.out::println);


    }
}
