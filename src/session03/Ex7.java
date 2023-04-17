package session03;

public class Ex7 {

    public static void main(String[] args) {

        //Write a code that finds
        // the number of positive divisors of a given number.

        int number = 48;

        int counter=0;

        for (int i = 1; i <=number ; i++) {
            if(number % i ==0) counter++;

        }

        System.out.println("counter = " + counter);




    }
}
