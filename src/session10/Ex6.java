package session10;

public class Ex6 {

    public static void main(String[] args) {
        //*Write a code which reverse a given number

        //First Solution
      int number=1562;
      String numberString=Integer.toString(number);

        String reversed="";

        for (int i = numberString.length()-1; i >=0 ; i--) {
            reversed+=numberString.charAt(i);
        }
        System.out.println("reversed = " + reversed);



        //Second Solution
        int num=2361;
        int reversedNum=0;

        while (num>0){ //23
            int digit=num % 10;
            reversedNum+=digit;
            if(num>9) reversedNum*=10;

            num/=10;
        }

        System.out.println("reversedNum = " + reversedNum);
    }
}
