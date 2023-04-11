package day14;

import java.util.Arrays;
import java.util.Random;

public class Ex2 {

    public static void main(String[] args) {
//*Generate 10 random numbers from 1 to 100 and check if all of them is unique or not.
        Random random =new Random();

        int[] numbers=new int[10];

        for (int i = 0; i <10 ; i++) {
            numbers[i]=random.nextInt(100)+1;
        }

       // System.out.println(Arrays.stream(numbers).distinct().count()==numbers.length); //Second solution
        int length=0;

        for (int i = 0; i < numbers.length; i++) {
            int counter=0;
            for (int j = i; j <numbers.length ; j++) {
                if(numbers[i]==numbers[j]) counter++;
            }
            if(counter==1) length++;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(length==numbers.length);



    }
}
