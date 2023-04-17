package session01;

import java.util.Arrays;

public class Ex10 {

    public static void main(String[] args) {
////Find the average of an integer array;

   int[] numbers={34,21,11,23,54,67,8};
   double total=0;

        for (int i = 0; i <numbers.length ; i++) {
            total+=numbers[i];
        }

        System.out.println(total/numbers.length);


        System.out.println(Arrays.stream(numbers).average().getAsDouble());


    }
}
