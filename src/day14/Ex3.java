package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        //Write a program that demonstrates the use of the for loop with two numbers from the user
        //Example
        //input
        //2
        //19
        //output
        //         for (int i = 2; i < 19; i++) {
        //             System.out.println(i);
        //         }



        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number :");
        int first=input.nextInt();

        System.out.println("Enter second number :");
        int second=input.nextInt();

        System.out.println("for (int i = "+first+"; i <"+second+" ; i++) {\n"+
                "System.out.println(i); \n}");






    }
}
