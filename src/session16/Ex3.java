package session16;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {
//*Reverse order each letter of each element of an array and edit each new words that
// they start with upper case and continues with lover cases

        String[] words = {"burak", "efe", "caglar", "yunus"};

        for (String each : words) {

            char[] eachChars = each.toCharArray();

            Arrays.sort(eachChars);//Orders chars

            String newEach = new String(eachChars); //convert char[] to string

            String reversedNewEach = "";


            for (int i = newEach.length() - 1; i >= 0; i--) { //revers NewEach

                reversedNewEach += newEach.charAt(i);

            }

            String result = reversedNewEach.substring(0, 1).toUpperCase() +
                    reversedNewEach.substring(1).toLowerCase(); //Edit each word

            System.out.println(result);


        }


    }
}
