package session06;

import java.util.stream.IntStream;

public class Ex1 {

    public static void main(String[] args) {

////Write a program to find the average of numbers in the range [7-30].

        int counter=0;
        double sum=0;

        for (int i = 7; i <=30 ; i++) {
            sum+=i;
            counter++;
        }

        System.out.println(sum/counter);



        //Second solution
       double average= IntStream.rangeClosed(7,30).average().getAsDouble();
        System.out.println("average = " + average);






    }
}
