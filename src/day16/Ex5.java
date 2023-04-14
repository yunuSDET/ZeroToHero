package day16;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {
/**Find all two different elements whose sum is 10 in an array
 int[] arr = {1,2,3,5,7,9,8,1};
 Output
 1,9
 2,8
 3,7
 5,5 -> not included (must be different(
 7,3 -> not included(same numbers found)
 9,1 -> not included ...
 8,2 -> not included ...
 1,9 -> not included ...
 */


        int[] arr = {1,2,3,5,7,9,8,1};
        String result="";
        int sum=10;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]+arr[j]==sum  && arr[i]!=arr[j] ){
                    if(!result.contains(arr[i]+","+arr[j]) && !result.contains(arr[j]+","+arr[i])){
                        result+=arr[i]+","+arr[j]+" ";

                        System.out.println(arr[i]+","+arr[j]);
                    }
                }
            }

        }





    }


}
