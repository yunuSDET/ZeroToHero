package session18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex3 {

    public static void main(String[] args) {
        //Find the sum of the first five largest elements of an arraylist
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,4,32,7,3,2,3,12,51));


        //First solution
        int sum1=0;
        Collections.sort(list1);
        Collections.reverse(list1);
        for (int i = 0; i <5 ; i++) {
          sum1+=list1.get(i);
        }
        System.out.println(sum1);



        //Second solution
        int sum2=list1.stream()
                .sorted(Collections.reverseOrder())
                .limit(5)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum2);



    }
}
