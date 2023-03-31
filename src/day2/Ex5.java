package day2;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
 //Get a number from the user
//Print the sum of all numbers from 1 to the entered number on the screen

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a number :");
        int number=scanner.nextInt();
        double total=0;
        for (int i = 1; i <=number ; i++) {
            total+=i;
        }

        System.out.println(total);

    }
}
