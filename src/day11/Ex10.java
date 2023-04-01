package day11;

import java.util.Arrays;

public class Ex10 {

    public static void main(String[] args) {
//*Write a program which convert a given array to have unique elements.
//

        String[] words = {"hi", "hello", "string", "hello", "if", "hi", "cake", "unique"};
        String[] newWords = new String[words.length];

        int index = 0;
        for (int i = 0; i < words.length; i++) {
            int counter = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) counter++;
            }
            if (counter == 1) {
                newWords[index] = words[i];
                index++;
            }
        }


        newWords = Arrays.copyOfRange(newWords, 0, index);
        System.out.println(Arrays.toString(newWords));


    }
}
