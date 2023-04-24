package session17;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {

        //Combine and print the first and last letter of each word in a sentence.

       String sentence="Hi, hello, how are you?";

        //First solution
        String[] words=sentence.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            String each=words[i].replaceAll("[^a-zA-Z]","");
            System.out.println(each.substring(0,1)+each.substring(each.length()-1));
        }

        //Second solution
        String[] words2=sentence.split("\\s+");
        words2=Arrays.stream(words2)
                .map(i->i.replaceAll("[^a-zA-Z]",""))
                .map(i->""+i.charAt(0)+i.charAt(i.length()-1))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(words2));

    }
}
