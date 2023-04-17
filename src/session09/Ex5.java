package session09;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {
//Reverse an array without using a new array


        String[] words={"hi","hello","great","meeting","take","go","ok"};

        for (int i = 0,j=words.length-1; i < words.length/2; i++,j--) {
            String temp=words[i];
            words[i]=words[j];
            words[j]=temp;
        }

        System.out.println(Arrays.toString(words));






    }
}
