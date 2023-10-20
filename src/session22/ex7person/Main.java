package session22.ex7person;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Map<Integer,Person> personMap=new HashMap<>();

        Person person1=new Person(1,"ad1","soyad1");
        Person person2=new Person(2,"ad2","soyad2");
        Person person3=new Person(3,"ad3","soyad3");
        Person person4=new Person(4,"ad4","soyad4");
        Person person5=new Person(5,"ad5","soyad5");







        personMap.put(person1.getId(),person1);
        personMap.put(person2.getId(),person2);
        personMap.put(person3.getId(),person3);
        personMap.put(person4.getId(),person4);
        personMap.put(person5.getId(),person5);



        for (Map.Entry<Integer, Person> eachPerson : personMap.entrySet()) {
            System.out.println(eachPerson.getValue());
        }





    }
}
