package session13;

import java.util.Arrays;

public class Ex5 {


    public static void main(String[] args) {

        //*write a code which prints the non-repeated results of multiply table (from 1 to 10)

        int[] results=new int[100];
        int counter=0;
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
               results[counter++]=i*j;
            }
        }

        int[] newResults=new int[results.length];
        int index=0;
        for (int i = 0; i < results.length; i++) {

            counter=0;

            for (int j = i; j < results.length; j++) {
                if(results[i]==results[j]) counter++;
            }

            if(counter==1) newResults[index++]=results[i];

        }

        newResults= Arrays.copyOf(newResults,index);
        System.out.println(newResults.length);


    }
}
