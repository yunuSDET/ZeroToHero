package session16;

public class Ex1 {

    public static void main(String[] args) {
//*Perfect number, a positive integer that is equal to the sum of its divisors.
// The smallest perfect number is 6, which is the sum of 1, 2, and 3.
// Other perfect numbers are 28, 496, and 8,128.
//List all perferct numbers form 1 to 100_000

        int counter=0;

        for (int i = 1; i <=100_000 ; i++) {
            if(isPerfect(i)){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Counter :"+counter);

    }

    public static boolean isPerfect(int number) {

        int sumOfDivisors = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) sumOfDivisors += i;
        }

        return (sumOfDivisors == number) ? true : false;


    }
}
