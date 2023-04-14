package day16;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        //*Take a three-digit number (which has different digits) from user and sort its numbers from smallest to largest and reverse sort this result. Finally find the differences of sorted values. And your new number is result you get. Repeat same steps for this number too.
        //After a few repeating you Will reach 495. The question is to find the number of repeations.

        Scanner input=new Scanner(System.in);


        System.out. println("Input a three-digit number");

        int number=input.nextInt();

        while(!String.valueOf(number).matches("[0-9]{3}") || !isUnique(number)){
            System.out.println("Enter a valid number");
            number=input.nextInt();
        }

        int counter=0;

        int result=0;
        while(result!=495){
            counter++;

            char[] digits=String.valueOf(number).toCharArray();
            Arrays.sort(digits);
            int sortedNumber=Integer.parseInt(String.valueOf(digits));
            int reverseSortedNumber=Integer.parseInt((new StringBuilder(String.valueOf(digits))).reverse().toString());
            result=Math.abs(sortedNumber-reverseSortedNumber);
            System.out.println(sortedNumber+"  "+reverseSortedNumber+" ===> "+result);
            number=result;

        }


        System.out.println(counter);











    }

    public static boolean isUnique(int number){
        return String.valueOf(number).length()== Arrays.stream(String.valueOf(number).split("")).distinct().count();
    }


}
