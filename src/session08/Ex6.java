package session08;

public class Ex6 {

    public static void main(String[] args) {

//*write a program that takes a string as input,
// takes the ASCII code of each character in the string,
// concatenates them with a comma between each code,
// and then converts the resulting string back to the original string with letters?"
//Input
// Hello, World!
//Output
//72,101,108,108,111,44,32,87,111,114,108,100,33
//Hello, World!

        String text="Hello, World!";

        String textAscii="";

        //Found the ascii version of string
        for (int i = 0; i <text.length() ; i++) {
            textAscii+=text.charAt(i)+0+",";
        }

        textAscii=textAscii.substring(0,textAscii.length()-1);
        System.out.println(textAscii);


        //Found the original text again
        String[] asciiChars=  textAscii.split(",");
        for (int i = 0; i < asciiChars.length; i++) {
            int eachCode=Integer.parseInt(asciiChars[i]);
            System.out.print((char)eachCode);
        }

    }
}
