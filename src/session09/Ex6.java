package session09;

import java.util.stream.IntStream;

public class Ex6 {

    public static void main(String[] args) {

        ////Find the average of even numbers from 1 to 100
        // that are divisible by 3 but not by 5
        double sum=0;
        int count=0;

        for (int i = 1; i <=100 ; i++) {
            if(i % 2 == 0 && i % 3 == 0  && i % 5 !=0){
                sum+=i;
                count++;
            }
        }

        System.out.println(sum/count);










       double average= IntStream.rangeClosed(1,100).filter(i->i % 2 == 0 && i % 3 == 0  && i % 5 !=0).average().getAsDouble();
        System.out.println("average = " + average);




    }
}
