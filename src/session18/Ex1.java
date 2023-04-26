package session18;

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1 {

    public static void main(String[] args) {
        //*List first 1000 numbers which are not divisible by 2,3,5,7,11

        //First solution
        ArrayList<Integer> numbers = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0) {
                numbers.add(i);
                counter++;
            }
            if (counter == 1000) break;
        }
        System.out.println(numbers);


        //Second solution
        ArrayList<Integer> divisors = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11));

        List<Integer> list = IntStream.rangeClosed(1, Integer.MAX_VALUE)
                .filter(i -> divisors.stream().noneMatch(j -> i % j == 0))
                .limit(1000)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);


    }
}
