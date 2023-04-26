package session18;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex4 {

    public static void main(String[] args) {
        //*Add random 1000 numbers between 1 and 100 into an ArrayList and find which number has biggest frequency
        Random random=new Random();

        //First solution
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(random.nextInt(100)+1);
        }
        int biggestFrequency=0;
        int frequencyI=0;
        for (int i = 1; i < 100; i++) {
            frequencyI=Collections.frequency(numbers ,i);
          if(frequencyI>biggestFrequency) biggestFrequency=  frequencyI;
        }
        System.out.println(biggestFrequency);


        //Second solution

//TODO SECOND SOLUTİON
        int biggest=numbers.stream()
                .reduce(1,(a,b)->Math.max(Collections.frequency(numbers,a),Collections.frequency(numbers,b)));
        System.out.println(biggest);


    }
}
