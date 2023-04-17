package session14;

public class Ex10 {


    public static void main(String[] args) {
        //*Find all prime numbers whose digits are also prime in the range [1000-10000]

        int counter=0;
        for (int i = 1000; i <10000 ; i++) {
            if(isPrime(i) && isDigitsPrime(i)){
                counter++;
                System.out.println(i);
            }
        }

        System.out.println(counter);

    }

    private static boolean isDigitsPrime(int number) {

        boolean isDigitsPrime=true;

       while(number>0){
           int eachDigit= number % 10;
           if(!isPrime(eachDigit)){
               isDigitsPrime=false;
               break;
           }
           number/=10;

       }
        return isDigitsPrime;
    }

    public static boolean isPrime(int number){

        if(number<2) return false;

        boolean isPrime=true;
        for (int i = 2; i < number; i++) {
            if(number % i ==0){
                isPrime=false;
                break;
            }

        }
        return isPrime;
    }


}
