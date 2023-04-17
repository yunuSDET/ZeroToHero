package session11;

public class Ex5 {

    public static void main(String[] args) {
        //*Write a program which changes the given word by writing the last vowel of the word three times.
        //Input : "teacher"
        //Output : "teacheeer"

        String word = "teacher";
        String newWord = "";
        String vowels = "aeiouAEIOU";

        for (int i = word.length() - 1; i >= 0; i--) {
            String activeLetter = word.substring(i, i + 1);
            if (vowels.contains(activeLetter)) {
                newWord = word.substring(0, i) + activeLetter.repeat(3) + word.substring(i + 1);
                break;
            }
        }

        System.out.println("newWord = " + newWord);


    }
}
