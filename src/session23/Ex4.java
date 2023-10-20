package session23;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex4 {

    public static void main(String[] args) {
/*
Write a Java Program to find the second-highest number in an array.
 */

//First solution
        int[] arr={2,3,1,64,2,53,22,654,75,5};
        Arrays.sort(arr);
        int secondHighestNumber=arr[arr.length-2];
        System.out.println(secondHighestNumber);



//Second solution
        int[] arr2={2,3,1,64,2,53,22,654,75,5};


        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < arr2.length-1; i++) {
                if(arr2[i]>arr2[i+1]) { //3,1
                    int temp=arr2[i+1];
                    arr2[i+1]=arr2[i];
                    arr2[i]=temp;
                }
            }
        }
        int secondHighestNumber2=arr[arr.length-2];
        System.out.println(secondHighestNumber2);


//Third solution
        int[] arr3={2,3,1,64,2,53,22,654,75,5};

        for (int i = 0; i <arr3.length; i++) {
            int countOfBigger=0;
            for (int j = 0; j <arr3.length ; j++) {
               if(arr3[i]<arr3[j]) countOfBigger++;
            }
            if(countOfBigger==1) {
                System.out.println(arr3[i]);
            }
        }




//Fourth solution
        int[]arr4={2,3,1,64,2,53,22,654,75,5};
        int highest =arr4[0];
        int secondHighest = arr4[0];

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > highest) {

                highest = arr4[i];
            } else if (arr4[i] > secondHighest) {
                secondHighest = arr4[i];
            }
        }
        System.out.println("Second highest number : " + secondHighest);



        //Fifth solution
       int[]arr5={2,3,1,64,2,53,22,654,75,5};
       int secondHighest2= Arrays.stream(arr5)
               .sorted()
               .skip(arr5.length-2)
               .findFirst().getAsInt() ;
        System.out.println(secondHighest2);


    }
}
