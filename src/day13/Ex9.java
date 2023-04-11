package day13;

import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

//Take 10 numbers from the user and print them without repetition
        Scanner input=new Scanner(System.in);

        int[] numbers=new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter "+(i+1)+". number ");
            numbers[i]=input.nextInt();
        }

        //Arrays.stream(numbers).distinct().forEach(i-> System.out.println(i+" "));

        System.out.println("-".repeat(100));


        int[] uniqueNubers=new int[numbers.length];

        int index=0;
        for (int i = 0; i <numbers.length ; i++) { //12,13,14,15,12,3,14

            int counter=0;

            for (int j = i; j <numbers.length ; j++) {
                if(numbers[i]==numbers[j]) counter++;//1
            }

            if(counter==1) uniqueNubers[index++]=numbers[i];//13,
        }

        uniqueNubers= Arrays.copyOf(uniqueNubers,index);
        System.out.println(Arrays.toString(uniqueNubers));



    }
}
