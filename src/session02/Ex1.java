package session02;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

//"Take three numbers from the user and print their average to the screen."
        Scanner scanner=new Scanner(System.in);

        System.out.println("Input first number :");
        int number1=scanner.nextInt();


        System.out.println("Input second number :");
        int number2=scanner.nextInt();

        System.out.println("Input third number : ");
        int number3=scanner.nextInt();

        double average=(number1+number2+number3)/3;
        System.out.println("average = " + average);


    }
}
