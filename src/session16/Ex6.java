package session16;

import java.util.Arrays;
import java.util.Random;

public class Ex6 {


    public static void main(String[] args) {
        //*Add all numbers from 1 to 10 into an array randomly. If any element is repeated add 10 random numbers again and again untill all elements are non-repeated

        int[] numbers = new int[10];
        Random random = new Random();

        int counter = 0;

        while (true) {

            for (int i = 0; i < 10; i++) {
                numbers[i] = random.nextInt(10) + 1;
            }

            counter++;

            if (numbers.length == Arrays.stream(numbers).distinct().count()) break;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(counter);

    }
}
