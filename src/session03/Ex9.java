package session03;

public class Ex9 {
    public static void main(String[] args) {
//Find if the given number is prime or not.

        int number=78;

        boolean isPrime=true;

        for (int i = 2; i <number ; i++) {
            if(number % i ==0){
                isPrime=false;
                break;
            }
        }

        if(isPrime){
            System.out.println(number+" is a prime number.");
        }else{
            System.out.println(number+ " is not a prime number.");
        }



    }
}
