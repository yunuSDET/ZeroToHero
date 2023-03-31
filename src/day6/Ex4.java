package day6;

public class Ex4 {

    public static void main(String[] args) {
//"Print the longest of three given texts."

        String text1="hitgrtgrtgrtr";
        String text2="hellorgggggggggg";
        String text3="starting";

        if(text1.length()>text2.length() && text1.length()>text3.length()){
            System.out.println("The longest text is = " + text1);
        }else if(text2.length()>text1.length() && text2.length()>text3.length()){
            System.out.println("The longest text is = " + text2);
        }else{
            System.out.println("The longest text is = " + text3);
        }



    }
}
