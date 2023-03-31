package day7;

public class Ex4 {

    public static void main(String[] args) {
        //*Get all uppercase letters from a given string and
        // print  each uppercase letters in new line.


        String text="My name is Yunus. Who are you?";
        String upperCaseLetters="";


        /*
        for (int i = 0; i < text.length(); i++) {
            if(text.substring(i,i+1).toUpperCase().equals(text.substring(i,i+1))){
                upperCaseLetters+=text.substring(i,i+1);
            }
        }
        */



        for (int i = 0; i < text.length(); i++) {

            if(Character.isUpperCase(text.charAt(i))){
                upperCaseLetters+=text.charAt(i);
            }
        }

        System.out.println("Upper Case Letters are " + upperCaseLetters);









    }
}
