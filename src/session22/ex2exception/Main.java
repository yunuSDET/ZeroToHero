package session22.ex2exception;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //First
        System.out.println("Sum of the two numbers is "+multi(6, 3));


        //Second
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=input.nextInt();
        try {
            if(number<0) throw new NegativeNumberException("Number can not be negative");
            System.out.println("Well done");
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }


        //Third
        int[] array={2,3,4,5,6};
        System.out.println("Sum of Elements Of The Array is "+sumOfElementsOfArray(array));


    }


    public static int multi(int number1,int number2){

        if(number1<0 || number2<0)
            throw new NegativeNumberException("Numbers can not be negative");

        return number1*number2;

    }


    public static int sumOfElementsOfArray(int[] array){
        int sum=0;
        for (int each : array) {
            if(each<0) throw new NegativeNumberException("Elements can not be negative");
            sum+=each;
        }
        return sum;
    }


}
