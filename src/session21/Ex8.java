package session21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
 *Create an ArrayList and add all the even numbers in it to another ArrayList.

 */
public class Ex8 {


    public static void main(String[] args) {

        //First solution
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(3,6,3,2,65,34,21,11,14));
        ArrayList<Integer> evenNumbers=new ArrayList<>();

        for (Integer each : numbers) {
            if(each % 2 ==0) evenNumbers.add(each);
        }

        System.out.println(evenNumbers);



        //Second solution
        ArrayList<Integer> numbers2=new ArrayList<>(Arrays.asList(3,6,3,2,65,34,21,11,14));
        ArrayList<Integer> evenNumbers2=numbers2.stream()
                .filter(i->i % 2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(evenNumbers2);


    }
}
