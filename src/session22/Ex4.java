package session22;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex4 {
/*
Generate 100 random number from 1 to 1000 and add them into a collection uniquely and sorted
 */

    public static void main(String[] args) {

        Random random=new Random();
        Set<Integer> numbers =new TreeSet<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(1000)+1);
        }

        System.out.println(numbers);


    }



}
