package day11;

public class Ex1 {

    public static void main(String[] args) {

        //Print each word that starts with an uppercase letter and
        // continues with lowercase letters in a given sentence

//First solution
        String sentence = "Hi friends my          name is Yunus and my best friend is X";

        sentence = sentence.replaceAll(" +", " ");

        String[] words = sentence.split(" ");


        for (int i = 0; i < words.length; i++) {
            String each = words[i];

            if (each.matches("[A-Z][a-z]+")) { //First letter must be upper case
                                                    //Second and other letters must be lowercase

                System.out.println(each);

            }

        }


        //Second solution
        String sentence1 = "Hi friends my          name is Yunus and my best friend is X";

        sentence1 = sentence1.replaceAll(" +", " ");

        String[] words1 = sentence1.split(" ");

        for (int i = 0; i < words1.length; i++) {

            String each = words1[i];
            boolean condition1 = each.substring(0, 1).toUpperCase()
                    .equals(each.substring(0, 1));

            boolean condition2 = each.substring(1)
                    .toLowerCase().equals(each.substring(1));

            if (condition1 && condition2) System.out.println(each);


        }


    }
}
