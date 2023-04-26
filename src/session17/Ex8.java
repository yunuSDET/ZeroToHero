package session17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex8 {

    public static void main(String[] args) {

        //*Create an ArrayList and remove all the elements that are divisible by 3.

        //First solution
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321,60,12));
        numbers.removeIf(i->i % 3 ==0);
        System.out.println(numbers);


        //Second solution
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321,60,12));
        numbers2=numbers2.stream()
                .filter(i->i % 3 !=0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numbers2);


        //Third solution
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321,60,12));
        ArrayList<Integer> newNumbers3 =new ArrayList<>();
        for (Integer each : numbers3) {
            if(each % 3 !=0) newNumbers3.add(each);
        }
        System.out.println(newNumbers3);


    }
}
