package session23;

import java.util.Arrays;

public class Ex7 {
/*
write a method to check if two Strings (words) are Anagrams or not.
 */
    public static void main(String[] args) {

        System.out.println(isAnagram("burak", "kubra"));
        System.out.println(isAnagram("yunus", "yusuf"));

    }

    public static boolean isAnagram(String word1,String word2){

        String[] letters1=word1.split("");
        String[] letters2=word2.split("");

        Arrays.sort(letters1);
        Arrays.sort(letters2);

        return Arrays.equals(letters1,letters2);
    }
}
