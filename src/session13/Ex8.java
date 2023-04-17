package session13;

public class Ex8 {


    public static void main(String[] args) {

//*Print a sentence by adding new line before each vowels.

        //First solution
        String sentence="Hi, my name is Yunus.";
        String vowels="aeıioöuüAEIİOÖUÜ";
        String newSentence="";

        for (int i = 0; i < sentence.length(); i++) {
            String eachCharacter=sentence.substring(i,i+1);
            if(vowels.contains(eachCharacter)){
                newSentence+="\n"+eachCharacter;
            }else{
                newSentence+=eachCharacter;
            }
        }

        System.out.println(newSentence);



        //Second solution
        String text=sentence.replaceAll("[aeıioöuüAEIİOÖUÜ]","\n$0");
        System.out.println(text);




    }

}
