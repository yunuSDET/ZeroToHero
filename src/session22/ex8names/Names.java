package session22.ex8names;

import java.util.HashMap;
import java.util.Map;

/*
Create a map which takes numbers as key and names as value
Add at least 6 names into map
Create a new map which takes numbers as key and the length of names of first map as value
Print the maps whose value's length is less than 5
 */
public class Names {


    public static void main(String[] args) {
        Map<Integer,String> names=new HashMap<>();

        names.put(1,"yunus");
        names.put(2,"ali");
        names.put(3,"ayşe");
        names.put(4,"ferhat");
        names.put(5,"burak");
        names.put(6,"gul");

        Map<Integer,Integer> lengths=new HashMap<>();

        for (Map.Entry<Integer, String> each : names.entrySet()) {
            lengths.put(each.getKey(),each.getValue().length());
        }



        for (Map.Entry<Integer, Integer> each : lengths.entrySet()) {
            if(each.getValue()<5) System.out.println(names.get(each.getKey()));
        }




    }









}
