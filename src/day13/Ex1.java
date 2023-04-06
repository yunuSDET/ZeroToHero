package day13;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
//*Check if each word of a given sentence's vowels are same or not.
//Examples:
//Kaya bin kere güldü. Output: true
//Recep yeni gitti Output: false
//Yemek yememek  için uyudu. Output: true






        String s1="Yunus uyur gider.";

        String[]words=s1.toLowerCase().split(" ");


        boolean isSame=true;

        for (String each : words) {

            each=each.replaceAll("[^aeıioöuü]","");

            char[] eachChars=each.toCharArray();

            Arrays.sort(eachChars);

            String eachSorted=new String(eachChars);

            String firstVowel=eachSorted.substring(0,1);

            String lastVowel=eachSorted.substring(each.length()-1);

            if(!firstVowel.equals(lastVowel)){
                isSame=false;
            }

        }





        System.out.println(isSame);




    }
}
