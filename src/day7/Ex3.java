package day7;

public class Ex3 {

    public static void main(String[] args) {
        //"If a text contains the word "java", delete this word and print "word deleted".
        // If it does not contain it, print "word not found"."


        String text="I love java";

        if(text.contains("java")){
           text= text.replace("java","");
            System.out.println("Word deleted");
        }else{
            System.out.println("Word not found");
        }






    }
}
