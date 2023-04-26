package session17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex7 {

    public static void main(String[] args) {

//Create an ArrayList and find its smallest and largest elements.

        //First solution
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321));
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("min = " + min);
        System.out.println("max = " + max);


        //Second solution
        ArrayList<Integer> number2 = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321));
        Collections.sort(number2);
        int min1 = number2.get(0);
        int max1 = number2.get(number2.size() - 1);
        System.out.println("min1 = " + min1);
        System.out.println("max1 = " + max1);





    }
}
