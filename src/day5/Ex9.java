package day5;

public class Ex9 {

    public static void main(String[] args) {

        //*Reverse each word of a given sentences

        String sentence="Hi, my name is Yunus";
        String newSentence="";
        String words[] = sentence.split(" ");
            //{"Hi,", "my","name","is","Yunus"}


        //First solution
        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            String reversed="";

            for (int j = word.length()-1; j>=0 ; j--) {
                reversed+=word.charAt(j);
            }
            newSentence+=reversed+" ";
        }

        System.out.println(newSentence.trim());









    }
}
