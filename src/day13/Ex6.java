package day13;

public class Ex6 {


    public static void main(String[] args) {

//*Find the first 100 prime numbers
// and concat them from first to last as a string
// and find the sum of each digits of the  result


     String primeNumbers="";

      int number=2;
      int counter=0;

        while(true){

            boolean isPrime=true;

            for (int i = 2; i <number ; i++) {
                if(number % i ==0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                primeNumbers+=number;
                counter++;
            }
            number++;

            if(counter==100) break;
        }

        int sum=0;
        for (int i = 0; i < primeNumbers.length(); i++) {
            sum+=Integer.parseInt(""+primeNumbers.charAt(i));
        }

        System.out.println(sum);


    }
}
