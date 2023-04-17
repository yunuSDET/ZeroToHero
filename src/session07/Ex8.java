package session07;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        //*Write a program that takes two numbers from the user and
        // returns the sum of them and
        // again asks the user for new two numbers to return sum of them  until user enters 112




        Scanner input=new Scanner(System.in);

        while (true){

            System.out.println("Enter first number :");
            int number1=input.nextInt();

            System.out.println("Enter second number :");
            int number2=input.nextInt();

            System.out.println(number1+" +"+ number2+" = "+(number1+number2));

            System.out.println("For quiting enter 112");
            int number3=input.nextInt();

            if(number3==112){
                break;
            }


        }




    }
}
