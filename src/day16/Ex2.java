package day16;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {
        //*Check if a word has unique characters or not

        //First Solution
        String word="hello";
        String unique="";

        for (int i = 0; i < word.length(); i++) {
            String eachCharacter=word.substring(i,i+1);
            if(!unique.contains(eachCharacter)) unique+=eachCharacter;
        }

        if(word.length()==unique.length()){
            System.out.println("The characters of word is unique");
        }else{
            System.out.println("The characters of word is not unique");
        }



        //Second Solution
        String word2="hello";
        String[] letters=word2.split("");
        boolean isUnique=Arrays.stream(letters).distinct().count()==word2.length();
        if(isUnique){
            System.out.println("The characters of word is unique");
        }else{
            System.out.println("The characters of word is not unique");
        }



    }
}
