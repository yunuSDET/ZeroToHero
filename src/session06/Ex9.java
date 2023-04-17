package session06;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        //*Take numbers from the user until zero is entered.
        // Find the sum of the all numbers.

        Scanner input=new Scanner(System.in);

        int sum=0;

        while(true){
            System.out.println("Enter a number (Press 0 for quiting)");
            int number=input.nextInt();
            if (number==0){
                break;
            }
            sum+=number;
        }

        System.out.println(sum);


    }
}
