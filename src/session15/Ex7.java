package session15;

public class Ex7 {


    public static void main(String[] args) {

//*Check if all vowels of a given word is unique or not.


        String word = "hello";
        String vowels = "aeıioöuüAEIİOÖUÜ";
        String nonRepatedVowelsOfWord = "";
        String vowelOfWords="";

        for (int i = 0; i < word.length(); i++) {
            String character = word.substring(i, i + 1);
            if (vowels.contains(character)) {
                vowelOfWords+=character;
                if (!nonRepatedVowelsOfWord.contains(character)) nonRepatedVowelsOfWord += character;
            }
        }

        System.out.println(nonRepatedVowelsOfWord.length()==vowelOfWords.length());




    }
}
