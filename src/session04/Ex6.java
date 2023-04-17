package session04;

import java.util.Scanner;

public class Ex6 {
    //Make the first letter of each word in the text
    // input entered by the user uppercase.
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Input two words :");
        String text=input.nextLine().toLowerCase();

        String firstWord=text.substring(0,text.indexOf(" "));
        String secondWord=text.substring(text.indexOf(" ")+1);

        firstWord=(""+firstWord.charAt(0)).toUpperCase()+firstWord.substring(1);
        secondWord=(""+secondWord.charAt(0)).toUpperCase()+secondWord.substring(1);
        System.out.println(firstWord+" "+secondWord);






    }






}
