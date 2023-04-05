package day13;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {

        //*Add even and odd numbers different arrays from an array

        int[] numbers = {1,3,4,5,6,7,23,21,56};

        int[]oddNumbers=new int[numbers.length];
        int[]evenNumbers=new int[numbers.length];
        int oddCounter=0;
        int evenCounter=0;


        for (int each : numbers) {
            if(each % 2 ==0){
                evenNumbers[evenCounter++]=each;
            }else{
                oddNumbers[oddCounter++]=each;
            }
        }

        oddNumbers=Arrays.copyOfRange(oddNumbers,0,oddCounter);
        evenNumbers=Arrays.copyOfRange(evenNumbers,0,evenCounter);

        System.out.println(Arrays.toString(oddNumbers));
        System.out.println(Arrays.toString(evenNumbers));
    }
}
