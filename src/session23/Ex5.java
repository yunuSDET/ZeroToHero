package session23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {
/*
Create a method which merges two arrays (with any type) into an arraylist and returns this arraylist


 */
    public static void main(String[] args) {

String[] names1={"yunus","burak"};
String[] names2={"nesrin","kubra","elif"};
System.out.println(merge(names1,names2));


Integer[] numbers1={9,1,2,3,4};
Integer[] numbers2={5,6,7};
System.out.println(merge(numbers1, numbers2).stream().sorted().collect(Collectors.toList()));


    }


    public static <T> List<T> merge(T[] array1,T[] array2){
        List<T> list=new ArrayList<>();
        list.addAll(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));

        return list;
    }





}
