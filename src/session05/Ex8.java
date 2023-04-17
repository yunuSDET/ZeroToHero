package session05;

public class Ex8 {

    public static void main(String[] args) {

//*Remove all letters which is before 'm' in alphabetic order from a given word


        // First solution
        String word1="alphabetic";

       String newWord1="";

        for (int i = 0; i <word1.length() ; i++) {
            char activeLetter=word1.charAt(i);
            if((activeLetter>='m' && activeLetter<='z') || (activeLetter>='M' && activeLetter<='Z') )  {
                   newWord1+=activeLetter;
            }
        }

       System.out.println(newWord1);



        //Second solution
        String word2="alphabetic";
        System.out.println(word2.replaceAll("[^M-Zm-z]", ""));
    }
}
