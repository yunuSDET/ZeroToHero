package day4;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
//Take a text input from the user.
// If the text starts with "a",
// print the first two letters of the text;
// otherwise, print the last two letters.

        Scanner input =new Scanner(System.in);
        String text=input.nextLine();

        if(text.startsWith("a")){
            System.out.println(text.substring(0,2));
        }else{
            System.out.println(text.substring(text.length()-2));
        }





    }
}
