package session10;

public class Ex9 {

    public static void main(String[] args) {
        //Edit a given text so that the repeating characters in the text are at the end,
        // the non-repeating characters are at the beginning and the comma is between the two.

        String text="ababcdkanHUXlme";
        String repeated="";
        String nonRepeated="";

        for (int i = 0; i <text.length() ; i++) {
             char activeChar=text.charAt(i);
                int counter=0;

                for (int j = 0; j <text.length() ; j++) {
                    char textingChar=text.charAt(j);
                    if(activeChar==textingChar){
                        counter++;
                    }
                }

                if(counter==1){
                    nonRepeated+=activeChar;
                }else {
                   repeated+=activeChar;
//                    if(!repeated.contains(""+activeChar)){
//                        repeated+=activeChar;
//                    }
                }

        }


        String result=nonRepeated+","+repeated;
        System.out.println("result = " + result);

        //Second solution
//        String text = "aabbdcccaagregbccbnhtraa";
//
//        String uniqChars = "";
//        String dubliqateChar = "";
//
//        for (int i = 0; i < text.length(); i++) {
//
//            char ch = text.charAt(i);
//
//            if (text.indexOf(ch) == text.lastIndexOf(ch)) {
//
//                uniqChars += text.charAt(i);
//
//            } else {
//                if(!dubliqateChar.contains(""+ch))
//
//                    dubliqateChar+=ch;
//            }
//        }
//
//        System.out.println(uniqChars + "," + dubliqateChar);



    }
}
