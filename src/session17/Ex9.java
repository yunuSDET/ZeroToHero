package session17;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex9 {

    public static void main(String[] args) {

//*Create an ArrayList of integers and find the sum of all the elements that are divisible by 3 or 5.



        //First solution
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321,60,12,1,25,34));
        int sum=0;
        for (Integer each : numbers) {
            if(each % 3==0 || each % 5==0) sum+=each;
        }
        System.out.println(sum);




        //Second solution
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321,60,12,1,25,34));
        int sum2=numbers2.stream()
                .filter(i->i % 3==0 || i % 5==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum2);




        //Third solution
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(3, 45, 6, 1, 65, 321,60,12,1,25,34));
        numbers3.removeIf(i->!(i % 3==0 || i % 5==0));
       int sum3= numbers3.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum3);





    }
}
