package session19;

public class Ex3 {

    public static void main(String[] args) {

//***Write a Java program that takes in a string and returns the longest palindrome substring in the string.
String text="abcbbakelmlekokuomlbayufeobekfeokllafebabokullu";

int longest=0;
String longestPalindrome="";

        for (int i = 0; i <text.length() ; i++) {
            String word=""+text.charAt(i);
            for (int j = i+1; j < text.length(); j++) {

                word+=text.charAt(j);
                if(isPalindrome(word)){
                    System.out.println(word);
                    if(longest<word.length()) {
                        longest=word.length();
                        longestPalindrome=word;

                    }

                }
            }
        }


        System.out.println(longestPalindrome);


    }
    public static boolean isPalindrome(String text){
        return text.equalsIgnoreCase(new StringBuilder(text).reverse().toString());
    }
}
