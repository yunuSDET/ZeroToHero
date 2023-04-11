package day13;

public class Ex10 {

    public static void main(String[] args) {
//*List all upper case and lower case letters which is not included in a given sentence.

        //First solution
        String letters="";
        String sentence = "Hi, my name is Yunus";

        for (char i = 'a'; i <='z' ; i++) {
            letters+=i;
        }

        for (char i = 'A'; i <='Z' ; i++) {
            letters+=i;
        }


        for (int i = 0; i < letters.length(); i++) {
            String eachLetter=letters.substring(i,i+1);
            if(!sentence.contains(eachLetter)) System.out.print(eachLetter+" ");
        }

        System.out.println("-".repeat(100));


        //Second solution
        letters=letters.replaceAll("[Hi, my name is Yunus]","");
        System.out.println(letters.replace(""," ").trim());

    }
}
