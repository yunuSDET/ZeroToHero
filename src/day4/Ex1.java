package day4;

public class Ex1 {

    public static void main(String[] args) {

//Find the sum of numbers between 34 and 1000
// that are divisible by 5 but not by 3.
        int sum=0;

        for (int i = 34; i <=1000 ; i++) {

            if(i % 5 == 0 && i % 3 != 0){
                sum+=i;
            }

        }

        System.out.println("Sum = " + sum);


    }
}
