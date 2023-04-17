package session05;

public class Ex10 {

    public static void main(String[] args) {
        //*write the biggest prime number in integer range

        int biggestInteger=Integer.MAX_VALUE;


        for (int i = biggestInteger; i > 0; i--) {


                boolean isPrime=true;


                for (int j = 2; j < i; j++) {
                    if(i % j ==0) {
                        isPrime=false;
                        break;
                    }
                }


                if (isPrime){
                    System.out.println(i);
                    break;
                }






        }






    }
}
