package session18;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex8 {

    public static void main(String[] args) {
        //*Print all strings of an ArrayList which start a capital letter and continue lower case letters

        //First solution
        ArrayList<String> texts=new ArrayList<>(Arrays.asList("Yunus","ayse","Tugba","Burak","çaglar","BURAK"));
        for (String each : texts) {
            if(Character.isUpperCase(each.charAt(0)) && each.substring(1).toLowerCase().equals(each.substring(1))){
                System.out.println(each);
            }
        }

        System.out.println("-".repeat(100));


        //Second solution
        ArrayList<String> texts2=new ArrayList<>(Arrays.asList("Yunus","ayse","Tugba","Burak","çaglar","BURAK"));
        texts2.stream()
                .filter(i->i.matches("[A-Z][a-z]+"))
                .forEach(System.out::println);




    }
}
