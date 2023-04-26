package session17;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Ex10 {

    public static void main(String[] args) {

//*Add numbers from 1 to 1000 into an arraylist.
// Remove all numbers which are divisible by 3 not 5 and find the sum of the remain of elements


        //First solution
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }
        numbers.removeIf(i->i % 3 ==0 && i % 5 !=0);
        int sum=0;
        for (Integer each : numbers)  sum+=each;
        System.out.println(sum);


        //Second solution
        int sum2=IntStream.rangeClosed(1,1000)
                .filter(i->!(i % 3 ==0 && i % 5 !=0))
                .sum();
        System.out.println(sum2);


        //Third solution
        ArrayList<Integer> numbers2=new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers2.add(i);
        }
        numbers2.removeIf(i->i % 3 ==0 && i % 5 !=0);
       int sum3= numbers2.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum3);

    }
}
