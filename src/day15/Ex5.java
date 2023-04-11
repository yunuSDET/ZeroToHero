package day15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        //int[] arr={2,5,7,1,8,4};
        //Generate a random number and check if the number is different  from the elements of the array. If it is equals one them generate a new one until the number is different. And finally print the number and array

        int[] arr = {2, 5, 7, 1, 8, 4};
        Random random = new Random();


        int number = 0;
        while (true) {


            number = random.nextInt(9);

            boolean isContained = false;
            for (int each : arr) {
                if (each == number) {
                    isContained = true;
                    break;
                }

            }

            if(!isContained){
                System.out.println(number);
                System.out.println(Arrays.toString(arr));
                break;
            }


        }


    }
}
