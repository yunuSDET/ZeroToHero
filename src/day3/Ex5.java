package day3;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        //Ask the user for a text input.
        // Convert all characters
        // in the text to uppercase and print the final text to the screen.

        Scanner input =new Scanner(System.in);

        System.out.println("Input text");
        String text=input.nextLine();

        text=text.toUpperCase();
        System.out.println("text = " + text);



    }
}
