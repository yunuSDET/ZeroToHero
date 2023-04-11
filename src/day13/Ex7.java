package day13;

import java.util.Arrays;

public class Ex7 {

    public static void main(String[] args) {

    //Q1: Largest Number:
    //Input: arr[] = {10, 4, 3, 50, 23, 90}
    //Output: 90


        //First solution - Sorting
         int arr[] = {10, 4, 3, 50, 23, 90,21};
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);


        //Second solution -
        int largest=Integer.MIN_VALUE;

        for (int each : arr) {
            if(largest<each){
                largest=each;
            }
        }

        System.out.println(largest);







    }
}
