package session03;

import java.util.stream.IntStream;

public class Ex10 {

    public static void main(String[] args) {
//Write a program that calculates the sum of all numbers between 40 and 300.

     int sum=0;

        for (int i = 40; i <=300 ; i++) {
            sum+=i;
        }

        System.out.println("sum = " + sum);


        //Second solution
        System.out.println(IntStream.rangeClosed(40,300).sum());
    }
}
