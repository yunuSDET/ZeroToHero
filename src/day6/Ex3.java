package day6;

public class Ex3 {

    public static void main(String[] args) {
//Print the factorial of all numbers from 1 to 12.


        for (int i = 1; i <=12 ; i++) {

            int factorial=1;
            for (int j = 1; j <=i ; j++) {
                factorial*=j;
            }

            System.out.println("The factorial of "+i+" is :"+factorial);
        }


        //Second solution
        for (int i = 1; i <=12 ; i++) {
            factorial(i);
        }



    }


    private static void factorial(int number) {
        int factorial=1;
        for (int i = 1; i <=number ; i++) {
            factorial*=i;
        }
        System.out.println("The factorial of "+number+" is :"+factorial);
    }


}
