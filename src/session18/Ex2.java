package session18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex2 {

    public static void main(String[] args) {
        ////Write a program to list the common elements of two ArrayLists.
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,4,7,3,2,3));
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(7,2,9,90,7));


        //First solution
        ArrayList<Integer> commonElements=new ArrayList<>();
        for (Integer each : list2) {
            if(list1.contains(each)) {
                if(!commonElements.contains(each)){
                    commonElements.add(each);
                }
            }
        }
        System.out.println(commonElements);



        //Second solution
        ArrayList<Integer> commonElements2=list1.stream()
                .filter(i->list2.contains(i))
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(commonElements2);


    }
}
