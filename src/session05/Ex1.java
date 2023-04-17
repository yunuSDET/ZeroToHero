package session05;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

//Write a code that reverses any text input entered.

        Scanner input =new Scanner(System.in);
        System.out.println("Input a text");
        String text=input.nextLine();

        String reversedText="";

        for (int i = text.length()-1; i >=0 ; i--) {
            reversedText+=String.valueOf(text.charAt(i));
        }

        System.out.println(reversedText);


        //Second solution
        System.out.println("Input a text");
        String text1=input.nextLine();

        StringBuilder sb=new StringBuilder(text1);
        System.out.println(sb.reverse());









    }
}
