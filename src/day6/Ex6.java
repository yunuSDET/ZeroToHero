package day6;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

//"Write a code that verifies that all digits of a three-digit number are different."


        Scanner input=new Scanner(System.in);

        System.out.println("Enter a three-digit number :");
        int number=input.nextInt();
        int temp=number;

        int base1=temp % 10;
        temp/=10;
        int base10=temp % 10;
        temp/=10;
        int base100=temp;

        if(base1 != base10 && base1 != base100 && base10 != base100){
            System.out.println(number + " has three different digit.");
        }else{
            System.out.println("Some of the digits of the "+number+" are equals.");
        }






    }
}
