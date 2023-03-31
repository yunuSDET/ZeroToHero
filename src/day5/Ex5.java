package day5;

public class Ex5 {

    public static void main(String[] args) {

//*write a program that finds the sum of numbers from 1 to the factorial of a given number


        int number=5;

        int factorial=1;

        for (int i = 1; i <=number ; i++) {
            factorial*=i;
        }

        int sum=0;
        for (int i = 1; i <=factorial ; i++) {
            sum+=i;
        }

        System.out.println("sum = " + sum);


    }
}
