package session19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Ex1 {

    public static void main(String[] args) {
//*List all unique elements of an ArrayList

        //First solution
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 2, 32, 7, 3, 2, 3, 12, 51, 32, 4));
        list.removeIf(i -> Collections.frequency(list, i) != 1);
        System.out.println(list);



        //Second solution
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 4, 2, 32, 7, 3, 2, 3, 12, 51, 32, 4));
        list2.stream()
                .filter(i -> Collections.frequency(list2, i) == 1)
                .forEach(i-> System.out.print(i+"  "));


        System.out.println();


        //Third solution
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 4, 2, 32, 7, 3, 2, 3, 12, 51, 32, 4));
        ArrayList<Integer> newList3=new ArrayList<>();

        for (Integer each : list3) {
            int counter=0;
            for (Integer each1 : list3) {
                if(each==each1) counter++;
            }
            if(counter==1) newList3.add(each);
        }
        System.out.println(newList3);


    }
}
