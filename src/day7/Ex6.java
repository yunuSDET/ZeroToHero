package day7;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        //"Print the letters of an entered text in alternating uppercase and lowercase format."
        //Input "hello"
        //Output "HeLlO";


        Scanner input =new Scanner(System.in);
        System.out.println("Enter a text.");
        String text=input.nextLine();
        String temp="";


        for (int i = 0; i <text.length() ; i++) {
            if(i % 2 ==0){
                temp+=text.substring(i,i+1).toUpperCase();
            }else{
                temp+=text.substring(i,i+1).toLowerCase();
            }
        }

        System.out.println(temp);


        String metin1="SELAM";
        String metin2="merha";
        String yeniMetin="";
        int countMetin1=0;
        int countMetin2=0;

        for (int i = 0; i <metin1.length(); i++) {

                yeniMetin+=""+metin1.charAt(i)+metin2.charAt(i);

        }
        System.out.println(yeniMetin);

    }
}
