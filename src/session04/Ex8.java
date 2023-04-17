package session04;

public class Ex8 {

    public static void main(String[] args) {
//"Convert the first letter of a given text to lowercase
// if it is uppercase, and to uppercase if it is lowercase."

        String text="gold";

        String firstLetter=String.valueOf(text.charAt(0));

        if(firstLetter.toUpperCase().equals(firstLetter)){
            firstLetter=firstLetter.toLowerCase();
        }else{
            firstLetter=firstLetter.toUpperCase();
        }

        text=firstLetter+text.substring(1);
        System.out.println("Text = " + text);



    }
}
