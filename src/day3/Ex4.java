package day3;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        //Ask the user for a text input.
        // Print the text
        // as many times as the number of characters in the text.

        Scanner input=new Scanner(System.in);
        System.out.println("Input text :");
        String text=input.nextLine();
        int times=text.length();

        for (int i = 0; i <times ; i++) {
            System.out.println(text);
        }






    }
}
