package day12;

import java.util.Arrays;
import java.util.Comparator;

public class Ex5 {

    public static void main(String[] args) {

//Reverse sort a given String array and print it


        //First solution
        String[] arr={"hi","hello","take","success","array"};

        Arrays.sort(arr);
        //[array, hello, hi, success, take]


        String[] newArr=new String[arr.length];

        int index=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            newArr[index++]=arr[i];
        }

        System.out.println(Arrays.toString(newArr));






        //Second solution
        String[] arr1={"hi","hello","take","success","array"};
        Arrays.sort(arr1, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr1));


    }
}
