package session18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex7 {

    public static void main(String[] args) {
//*Reverse all elements of an Arraylist of Integer and sort new Arraylist and then find the sum of first three elements


        //First solution
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(17,44,32,72,367,27,31,12,51));

        for (int i = 0; i < list.size(); i++) {
            Integer each=list.get(i);
            String stringEach=String.valueOf(each);
            String stringReversedEach=(new StringBuilder(stringEach).reverse().toString());
            Integer reversedEach=Integer.valueOf(stringReversedEach);
            list.set(i,reversedEach);
        }
        Collections.sort(list);

        int sum=0;
        for (int i = 0; i <3 ; i++) {
            sum+=list.get(i);
        }
        System.out.println(sum);



        //Second solution
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(17,44,32,72,367,27,31,12,51));
       int sum2= list2.stream()
                .map(i->Integer.valueOf(new StringBuilder(String.valueOf(i)).reverse().toString()))
                .sorted()
                .limit(3)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum2);


    }
}
