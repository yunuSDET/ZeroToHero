package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ex7 {

    public static void main(String[] args) {

        //*Add random numbers (1-100) to each element of a given array. If any element is  bigger than 100 (in new array) remove them and print result array


        int[] numbers = {3, 35, 62, 12, 43, 65};

        Random random = new Random();


        numbers=Arrays.stream(numbers)
                .map(i->i+random.nextInt(100)+1)
                .filter(i -> i <= 100)
                .toArray();

        System.out.println(Arrays.toString(numbers));



    }

}
