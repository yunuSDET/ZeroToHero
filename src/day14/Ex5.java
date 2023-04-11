package day14;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

//*write a program to count the number of same letters from two different string (take from the user).
//Input
//three
//take
//Output
//2

        Scanner input =new Scanner(System.in);

        System.out.println("Enter first word");
        String str1=input.nextLine();

        System.out.println("Enter second word");
        String str2=input.nextLine();

        String result="";



        for (int i = 0; i < str1.length(); i++) {

            for (int j = 0; j < str2.length(); j++) {

                if(str1.charAt(i)==str2.charAt(j) && !result.contains(str1.substring(i,i+1))){
                        result+=str1.substring(i,i+1);
                }

            }

        }

        System.out.println(result.length());


    }
}
