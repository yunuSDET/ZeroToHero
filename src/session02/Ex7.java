package session02;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
//Get start and end values from the user
//Print all even numbers in the range.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Input start value :");
        int startValue=scanner.nextInt();

        System.out.println("Input end value :");
        int endValue=scanner.nextInt();

        for (int i = startValue; i <=endValue ; i++) {

            if(i % 2 ==0) System.out.println(i);

        }


    }
}
