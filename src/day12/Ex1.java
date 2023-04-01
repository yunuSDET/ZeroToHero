package day12;


import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
        //Write all the elements of an array without using the Arrays.toString() method,
        // but the output must have the same result
        // as if you had used the Arrays.toString() method.

  String[] words = {"hi", "hello", "string", "hello", "if", "hi", "cake", "unique"};

        String result="";

        for (int i = 0; i < words.length; i++) {
            result+=words[i]+", ";
        }

        //System.out.println(Arrays.toString(words));
        System.out.println("["+result.substring(0,result.length()-2)+"]");




    }
}
