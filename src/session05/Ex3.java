package session05;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
//"Take 3 numbers from the user and
// if the numbers are different from each other, print 'Verified',
// otherwise print 'Invalid'."

        Scanner input =new Scanner(System.in);

        System.out.println("Input first number :");
        int number1=input.nextInt();

        System.out.println("Input second number :");
        int number2=input.nextInt();

        System.out.println("Input third number :");
        int number3=input.nextInt();


        if(number1!=number2 && number1 !=number3 && number2 != number3){
            System.out.println("Verified");
        }else{
            System.out.println("Invalid");
        }




    }
}
