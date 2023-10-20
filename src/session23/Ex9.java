package session23;

public class Ex9 {

    //create a method which returns the sum  of digits of a number

    public static void main(String[] args) {

        System.out.println(findTheSumOfDigits(-235));


    }







   public static int findTheSumOfDigits(int number){

        number=Math.abs(number);


        int sum=0;

        while (number>0){
            sum+=number % 10;
            number/=10;
        }

        return sum;

   }









}
