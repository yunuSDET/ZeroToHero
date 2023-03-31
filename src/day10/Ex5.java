package day10;

public class Ex5 {

    public static void main(String[] args) {
//*Write a program that puts each digit in a string in double quotes
//Input Hello3Hi34
//Output Hello"3"Hi"3""4"


        String text = "Hello3Hi34";
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            char activeCharacter = text.charAt(i);
            if ((activeCharacter >= '0' && activeCharacter <= '9') ) {
                newText += "\"" + activeCharacter + "\"";

            } else {
                newText += activeCharacter;
            }

        }
        System.out.println("newText = " + newText);



        //Second solution
        String text2 = "Hello3Hi34";
        text2 = text2.replaceAll("[0-9]", "\"$0\"");
        System.out.println("text2 = " + text2);


    }
}
