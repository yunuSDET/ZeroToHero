package session15;

import java.util.Arrays;

public class Ex9 {

    public static void main(String[] args) {
    String[] words={"Ahmet","Veli","Ali","Ahmet","Çağlar"};
   words= reverseArray(words);
        System.out.println(Arrays.toString(words));


    }


    public static String[] reverseArray(String[] array){
        int counter=0;
        String[] newArray=new String[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            newArray[counter++]=array[i];
        }

        return newArray;
    }


}
