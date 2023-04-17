package session13;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        //*Find the average of an array

        //First solution
        int[] numbers={32,34,23,54,2,36};

        double sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }


        System.out.println("Average is "+sum/numbers.length);




        //Second solution
        System.out.println(Arrays.stream(numbers).average().getAsDouble());


    }
}
