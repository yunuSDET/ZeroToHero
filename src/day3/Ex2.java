package day3;

public class Ex2 {

    public static void main(String[] args) {
//Calculate the sum of numbers between 1 and 100
// that are divisible by 5, and print the result to the screen.


    int sum=0;

        for (int i = 1; i <=100 ; i++) {
            if(i % 5 ==0) sum+=i;
        }


        System.out.println("sum = " + sum);


    }
}
