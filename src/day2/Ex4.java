package day2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        //1) Get a number between 1 and 12 from the user
        //2) Calculate the factorial of the number

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number between 1 and 12 :");
        int number=scanner.nextInt();
        int factorial=1;
        for (int i = 1; i <=number ; i++) {
            factorial*=i;
        }
        System.out.println("The factorial of "+number+" is " + factorial);


    }
}
