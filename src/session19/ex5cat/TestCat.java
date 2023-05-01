package session19.ex5cat;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCat {

    public static void main(String[] args) {

        Cat cat1=new Cat("Cat1",4,'M');
        Cat cat2=new Cat("Cat2",2,'M');
        Cat cat3=new Cat("Cat3",3,'F');
        Cat cat4=new Cat("Cat4",5,'M');
        Cat cat5=new Cat("Cat5",8,'F');
        Cat cat6=new Cat("Cat6",7,'M');





        ArrayList<Cat> cats=new ArrayList<>(Arrays.asList(cat1,cat2,cat3,cat4,cat5,cat6));

        for (Cat eachCat : cats) {
            if(eachCat.age<5 && eachCat.gender=='M'){
                System.out.println(eachCat);
            }
        }




    }
}
