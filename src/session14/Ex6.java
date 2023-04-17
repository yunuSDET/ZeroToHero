package session14;

import java.util.Arrays;

public class Ex6 {

    public static void main(String[] args) {
        //*write a program which order each letter of each word of a sentence in alphabetic order.
        //Input
        //take care
        //Output
        //aekt acer
        //Note1: Don't use Turkish letters.
        //Note2:All letters should be lowercase.

        String sentence ="yunus kulcu";
        String[] words=sentence.split(" ");

        String result="";

        for (String each : words) {
            char[] chars=each.toCharArray();
            Arrays.sort(chars);
          each=new String(chars);
            result+=each+" ";

        }


        System.out.println(result.trim());


    }
}
