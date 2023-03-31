package day2;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
//Find the largest of three taken numbers from user.

        Scanner scanner=new Scanner(System.in);


        System.out.println("Input first number :");
        int number1=scanner.nextInt();

        System.out.println("Input second number :");
        int number2=scanner.nextInt();

        System.out.println("Input third number :");
        int number3=scanner.nextInt();



        int largest=number1;

        if(largest<number2){
            largest=number2;
        }
        if(largest<number3){
            largest=number3;
        }
        System.out.println("largest = " + largest);

    }
}
