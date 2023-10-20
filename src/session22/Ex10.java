package session22;

import java.util.HashMap;
import java.util.Map;

public class Ex10 {

//Write a Java Program to count the number of words in a string using HashMap.


    public static void main(String[] args) {

String sentence="My name is yunus who you are I know who you are but I don't say anything.";

String[] words=sentence.split(" ");

        Map<String,Integer> numbersOfWords=new HashMap<>();

        for (String eachWord : words) {

            if(numbersOfWords.containsKey(eachWord)){
                int numberOfWord=numbersOfWords.get(eachWord);

                numbersOfWords.put(eachWord,++numberOfWord);

            }else {
                numbersOfWords.put(eachWord,1);
            }

        }

        System.out.println(numbersOfWords);


    }
}
