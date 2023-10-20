package session23;

public class Ex2 {

    /*
    Write a method to find whether a number is prime or not.
     */

    public static void main(String[] args) {


        System.out.println(isPrime(41));




    }


    public static boolean isPrime(int number){



       if(number<2) return false;


       for (int i = 2; i <number ; i++) {

            if(number % i ==0) return false;

       }

       return true;

    }


}
