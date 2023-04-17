package session04;

public class Ex10 {

    public static void main(String[] args) {
//"Add the * character before the first the word of 'gold' in a given text."

     String text="Hi, this is gold";


     int indexOfStart=text.indexOf("gold");
     text=text.substring(0,indexOfStart) + "*" + text.substring(indexOfStart);
     System.out.println(text);


     //Second solution
        String text2="Hi, this is gold";
        text2=text2.replaceFirst("gold","*gold");
        System.out.println(text2);


    }
}
