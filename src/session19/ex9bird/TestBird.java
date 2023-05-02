package session19.ex9bird;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBird {

    public static void main(String[] args) {

        Bird bird1=new Bird("bird1",true,5);
        Bird bird2=new Bird("bird2",false,4);
        Bird bird3=new Bird("bird3",true,7);
        Bird bird4=new Bird("bird4",false,2);
        Bird bird5=new Bird("bird5",true,9);

        ArrayList<Bird> birds=new ArrayList<>(Arrays.asList(bird1,bird2,bird3,bird4,bird5));

        //First solution
        System.out.println("Can Fly");
        for (Bird each : birds) {
            if(each.isFly) System.out.println(each);
        }

        System.out.println("Adult Birds");
        for (Bird each : birds) {
            if(each.age>5) System.out.println(each.name.toUpperCase());
        }

        System.out.println("-".repeat(100));


        //Second solution
        System.out.println("Can Fly");
        birds.stream()
                .filter(i->i.isFly)
                .forEach(System.out::println);



        System.out.println("Adult Birds");
        birds.stream().filter(i->i.age>5)
                .map(i->i.name.toUpperCase())
                .forEach(System.out::println);




    }
}
