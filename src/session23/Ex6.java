package session23;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex6 {
/*
Find all the repeating substrings in a given String
 */
    public static void main(String[] args) {


        String test="hifriekleendsyorilhowareyouzifr";

        Set<String> repeatedSubStrings=new HashSet<>();


        for (int i = 0; i < test.length(); i++) {

            for (int j = i+1; j < test.length(); j++) {
                String subString=test.substring(i,j);
                if(test.indexOf(subString)!=test.lastIndexOf(subString)){
                    repeatedSubStrings.add(subString);
                }
            }
        }

        System.out.println(repeatedSubStrings);






    }

}
