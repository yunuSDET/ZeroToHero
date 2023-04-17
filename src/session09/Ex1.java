package session09;

public class Ex1 {

    public static void main(String[] args) {

//*Write each sentence of a given text in new line

        String sentences="Hi! My name is Yunus. What is your name?";
        String specialCharacters=".!?";

        //First solution
        String eachSentence="";
        for (int i = 0; i < sentences.length(); i++) {
            if(specialCharacters.contains(sentences.substring(i,i+1))){
                eachSentence+=sentences.charAt(i);
                System.out.println(eachSentence.trim());
                eachSentence="";
            }else{
                eachSentence+=sentences.charAt(i);
            }
        }




        //Second solution
        System.out.println("-".repeat(100));
        String[] sentencesArray=sentences.split("\\.|!|\\?");
        for (String s : sentencesArray) {
            System.out.println(s.trim());
        }



    }
}
