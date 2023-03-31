package day3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
//Take 4 numbers from user, calculate their average,
//And print the result to the screen.

        Scanner scanner =new Scanner(System.in);

        System.out.println("Input first number :");
        int n1=scanner.nextInt();

        System.out.println("Input second number :");
        int n2=scanner.nextInt();

        System.out.println("Input third number :");
        int n3=scanner.nextInt();

        System.out.println("Input fourth number :" );
        int n4=scanner.nextInt();

        double average=(n1+n2+n3+n4)/4;

        System.out.println("average = " + average);




    }
}
