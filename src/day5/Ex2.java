package day5;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
//Check if a given word is a palindrome.

        Scanner input =new Scanner(System.in);

        System.out.println("Input a word :");
        String word=input.nextLine();

        StringBuilder sb=new StringBuilder(word);

        if(word.equals(sb.reverse().toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }





    }
}
