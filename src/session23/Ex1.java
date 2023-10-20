package session23;

import java.util.Arrays;

public class Ex1 {

/*
Write a method to find whether a string or number is palindrome or not. (Do not use any built in method to reverse)
 */
    public static void main(String[] args) {


        System.out.println(isPalindrome("yunus"));
        System.out.println(isPalindrome("nalan"));


    }


    public static boolean isPalindrome(String string){

    String reversed="";

        for (int length = string.length()-1; length >= 0; length--) {
            reversed+=string.charAt(length);
        }
       return reversed.equalsIgnoreCase(string);

    }


    public static boolean isPalindrome(int number){
        String string=number+"";
        String reversed="";

        for (int length = string.length()-1; length >= 0; length--) {
            reversed+=string.charAt(length);
        }
        return reversed.equalsIgnoreCase(string);

    }

}


