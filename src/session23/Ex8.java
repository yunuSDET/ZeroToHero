package session23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex8 {
    //create a method which takes 3 numbers as parameter and returns largest one
    public static void main(String[] args) {


        System.out.println(findLargest(3, 1, 76));


    }



    public static int findLargest(int n1,int n2,int n3){

        ArrayList list=new ArrayList<Integer>(Arrays.asList(n1,n2,n3));
        int num= (int) Collections.max(list);
        return  num;

    }












}
