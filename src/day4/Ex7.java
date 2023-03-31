package day4;

public class Ex7 {

    public static void main(String[] args) {
 //Print the three largest numbers below 5000 that are divisible by 37.
        int counter=0;

        for (int i = 5000; i >=0 ; i--) {
            if(i % 37 ==0){
                System.out.println(i);
                counter++;
            }

            if(counter==3){
                break;
            }
        }


    }
}
