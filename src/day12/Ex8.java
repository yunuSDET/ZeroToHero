package day12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex8 {

    public static void main(String[] args) {
//*Merge two int arrays as result array has unique elements.
// Note: If an element is repeated, add only one of them.


        //Frist solution
        int[] arr1={1,2,3,4};
        int[] arr2={3,4,5,6,7,4};



        int[] newArr=new int[arr1.length+arr2.length];

        int index=0;

        for (int each : arr1) {
            newArr[index++]=each;
        }

        for (int each : arr2) {
            newArr[index++]=each;
        }

    System.out.println(Arrays.toString(Arrays.stream(newArr).distinct().toArray()));


        int[] result=new int[newArr.length];
        int indexResult=0;
        for (int i = 0; i < newArr.length; i++) {
            int counter=0;
            for (int j = i; j <newArr.length ; j++) {
                if(newArr[i]==newArr[j]){
                    counter++;

                }
            }
            if(counter==1) result[indexResult++]=newArr[i];
        }

        result=Arrays.copyOfRange(result,0,indexResult);
        System.out.println(Arrays.toString(result));



    }
}
