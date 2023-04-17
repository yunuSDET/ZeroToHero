package session11;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        //*Take from the user 10 numbers and add them into an array.
        // Then print each element of the array sparated by ","
        //Note: if any input is not numeric ask again and again until the input is numeric.

        Scanner input =new Scanner(System.in);
        int count=10; //the count of numbers

        String[] numbers=new String[count];

        for (int i = 0; i <count ; i++) {

            System.out.print("Enter "+(i+1)+". number :");
            String number=input.nextLine();

            if(number.matches("[0-9]+")){

                numbers[i]=number; //Integer.parsInt(number)

            }else{

                System.out.println("You must enter numeric values:");
                i--;

            }


        }

        String result= Arrays.toString(numbers);
        System.out.println(result.substring(1, result.length() - 1));


    }
}
