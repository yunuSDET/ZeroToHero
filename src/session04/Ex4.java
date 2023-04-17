package session04;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        //Find the sum of digits of a four-digit number entered.

        Scanner input =new Scanner(System.in);

        System.out.println("Input a number");
        int number=input.nextInt();
        int sum=0;


        while (number>0){

            sum+=number % 10;
            number/=10;

        }

        System.out.println(sum);


    }
}
