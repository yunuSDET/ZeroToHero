package day6;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        //Take 10 numbers from the user and find the largest of them.

        Scanner input=new Scanner(System.in);
        int largest=Integer.MIN_VALUE;

        for (int i = 0; i <10 ; i++) {
            System.out.println("Enter "+(i+1)+" number :");
            int number=input.nextInt();
            if(number>largest){
                largest=number;
            }
        }

        System.out.println("The largest number is :"+largest);

    }
}
