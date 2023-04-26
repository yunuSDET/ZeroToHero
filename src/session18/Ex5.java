package session18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {

    public static void main(String[] args) {
//*Find the number of all uppercase letters of all elements of an arraylist

        //First solution
        ArrayList<String> texts=new ArrayList<>(Arrays.asList("Hi","Yunus Külcü","Hi","TAKE"));
        int totalUpperCases=0;
        for (String each : texts) {
            for (int i = 0; i < each.length(); i++) {
                if(Character.isUpperCase(each.charAt(i))) totalUpperCases++;
            }
        }
        System.out.println(totalUpperCases);



        //Second solution
        long total=texts.stream()
                .map(i->i.chars().filter(Character::isUpperCase).count())
                .mapToLong(Long::longValue)
                .sum();
        System.out.println(total);



        //Third solution
        String myText= Arrays.toString(texts.toArray());
        System.out.println(myText.replaceAll("[^A-Z]", "").length());



    }
}
