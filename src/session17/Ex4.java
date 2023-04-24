package session17;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {

        //*Print all strings whose length is less than 4 in an array.

        String[] words={"hi","hello","hate","lake","like","wonder"};

        //First solution
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()<4) System.out.println(words[i]);
        }



        //Second solution
        Arrays.stream(words)
                .filter(i->i.length()<4)
                .forEach(System.out::println);


        //Third solution
        ArrayList<String> wordList=new ArrayList<>(Arrays.asList(words));
        wordList.removeIf(i->i.length()>=4);
        System.out.println(wordList);


    }
}
