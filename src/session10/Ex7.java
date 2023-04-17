package session10;

public class Ex7 {

    public static void main(String[] args) {
        //*List all palindrom numbers from 10 to 10000

        for (int j = 10; j <=10000 ; j++) {
            //Solution for each number
            int number=j;
            String numberString=Integer.toString(number);

            String reversed="";

            for (int i = numberString.length()-1; i >=0 ; i--) {
                reversed+=numberString.charAt(i);
            }

            //Solution for each number

            if(numberString.equals(reversed)){
                System.out.println("Palindrom numbers : " + j);
            }


        }



    }
}
