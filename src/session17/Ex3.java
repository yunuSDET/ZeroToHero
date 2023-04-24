package session17;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Ex3 {

    public static void main(String[] args) {
        //*Sort an integer array from largest to smallest.

        //First solution
        int[] myArray={2,4,5,6,7,2,78,8};
        Arrays.sort(myArray);
        int[] myNewArray=new int[myArray.length];
        int index=0;
        for (int i = myArray.length - 1; i >= 0; i--) {
            myNewArray[index++]=myArray[i];
        }
        System.out.println(Arrays.toString(myNewArray));


        //Second solution
        Integer[] array={2,4,5,6,7,2,78,8}; //array must be wrapper class
        Arrays.sort(array,Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));



        //Third solution
        int[] arr={2,4,5,6,7,2,78,8};
        Arrays.stream(arr)
                .mapToObj(Integer::valueOf)
                .sorted(Comparator.reverseOrder());



    }
}
