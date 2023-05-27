package session21;

import java.util.Scanner;

/*
Create a Java program that performs division of two numbers provided by the user. Use try-catch blocks to handle any arithmetic exceptions that may occur.
 */
public class Ex9 {


    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
int number1=0;
int number2=0;
int result=0;
        while (true){

            try {

                System.out.println("Enter first number :");
                number1=input.nextInt();

                System.out.println("Enter second number :");
                number2=input.nextInt();
                       if(number2==0) {
                           throw new ArithmeticException("Divisor can not be zero");
                       }
                break;
            }catch (RuntimeException e){



                System.out.println("Invalid number, please try again.");
                System.out.println(e.getMessage());

                input.nextLine();
            }

        }


    }
}
