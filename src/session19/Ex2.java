package session19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {


    public static void main(String[] args) {
        //*Print a sublist of an arraylist not included the smallest and the largest elements

        //First solution
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 2, 32, 7, 3, 2, 3, 12, 51, 32, 4));
        list1.removeIf(each -> each == Collections.max(list1) || each == Collections.min(list1));
        System.out.println(list1);



        //Second solution
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,4,2,32,7,3,2,3,12,51,32,4));
        Integer min=Collections.min(list3);
        Integer max=Collections.max(list3);
        list3.removeAll(Arrays.asList(min,max));
        System.out.println(list3);


    }
}
