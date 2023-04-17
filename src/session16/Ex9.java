package session16;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex9 {

    public static void main(String[] args) {
        //*Increase by 6 each element of an int array,
        // and remove elements which are less then 20 and print the new array.

        //First solution
        int[] array={4,6,2,12,4,18,65,16,7};
        int[] newArray=new int[array.length];

        int index=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]+6>=20) newArray[index++]=array[i]+6;
        }
        newArray= Arrays.copyOf(newArray,index);
        System.out.println(Arrays.toString(newArray));


        //Second solution
        int[] arr={4,6,2,12,4,18,65,16,7};
       arr= Arrays.stream(arr).map(i->i+6).filter(i->i>=20).toArray();
        System.out.println(Arrays.toString(arr));





    }
}
