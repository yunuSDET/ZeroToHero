package day6;

public class Ex5 {

    public static void main(String[] args) {

        //"Find the sum of positive divisors of a given number."

        int number=24;
        int sum=0;

        for (int i = 1; i <=number ; i++) {
            if(number % i ==0) sum+=i;
        }

        System.out.println("The sum of positive divisors of "+number+" is " + sum);



    }
}
