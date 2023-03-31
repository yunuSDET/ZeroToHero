package day7;

public class Ex9 {

    public static void main(String[] args) {
        //*Write a program to list all three-digit numbers
        // where the digits are sorted from smallest to largest.


        for (int i = 100; i <=999 ; i++) {

            int ones=i % 10 ;
            int tens=i /10 % 10;
            int hundreds = i/100;

            if(hundreds<tens && tens<ones){
                System.out.println(i);

            }

        }





    }
}
