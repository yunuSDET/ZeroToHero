package session21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex7 {
/*
 *Write a Java program that takes in a string and returns the most frequent character in the string.
 */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a text:");
        String text=input.nextLine();

        //First solution
        int mostFrequent=0;
        char mostFrequentChar=text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            int currentCharsFrequency=0;
            for (int j = 0; j < text.length(); j++) {
                if(text.substring(i,i+1).equalsIgnoreCase(text.substring(j,j+1))) currentCharsFrequency++;
            }
            if(currentCharsFrequency>mostFrequent) {

                mostFrequent = currentCharsFrequency;
                mostFrequentChar=text.charAt(i);
            }
        }

        System.out.println(mostFrequentChar+" ==> "+mostFrequent);


        //Second solution
        ArrayList<String> letters=new ArrayList<>(Arrays.asList(text.split("")));
        String mostFre="";
        int mostFreq=0;
        for (int i = 0; i <text.length() ; i++) {
        if(mostFreq<Collections.frequency(letters,text.substring(i,i+1))){
            mostFreq=Collections.frequency(letters,text.substring(i,i+1));
            mostFre=text.substring(i,i+1);
        }
        }
        System.out.println(mostFre+" ==> "+mostFreq);


    }
}
