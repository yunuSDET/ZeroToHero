package day13;

public class Ex1 {

    public static void main(String[] args) {
//*Check if each word of a given sentence's vowels are same or not.
//Examples:
//Kaya bin kere güldü. Output: true
//Recep yeni gitti Output: false
//Yemek yememek  için uyudu. Output: true


        String str1="Kaya bin kere güldü.";
        String str2="Recep yeni gitti";
        String str3="Yemek yememek  için uyudu.";

        String vowels="aeıioöuü";

        isSame(str1);







    }

    private static void isSame(String text) {
        String[] words=text.split("\\s+");

        for (String each : words) {

        }

    }
}
