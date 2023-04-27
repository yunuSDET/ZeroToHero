package session18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex9  {

    public static void main(String[] args) {
        //*List  first 100 numbers whose sum of digits are 20



        //First solution
        ArrayList<Integer> numbers=new ArrayList<>();
        int counter=0;
        for (int i = 1; i <Integer.MAX_VALUE ; i++) {
            if(sumOfDigits(i)==20){
                counter++;
                numbers.add(i);
            }
            if(counter==100) break;
        }
        System.out.println(numbers);


        //Second solution
        List<Integer> numbers2=IntStream.rangeClosed(1,Integer.MAX_VALUE)
                .filter(i->sumOfDigits(i)==20)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(numbers2);




    }
    public static int sumOfDigits(int number){
        int sum=0;
        for (int i = number; i>0 ; i/=10) {
            sum+=i % 10;
        }
        return sum;
    }
}
