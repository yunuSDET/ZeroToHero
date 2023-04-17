package session10;

public class Ex10 {

    public static void main(String[] args) {

//*Write a program that counts  the number of the letters of a given sentences.
// (Not including special characters and spaces)

String text="Hi, my name is Yunus.";
        int count=0;
        for (int i = 0; i <text.length() ; i++) {
            char activeChar=text.charAt(i);
            if((activeChar>='a' && activeChar<='z') || (activeChar>='A' && activeChar<='Z')){
                count++;
            }
        }
        System.out.println("count = " + count);


        //Second solution
        String text2="Hi, my name is Yunus.";
        System.out.println(text2.replaceAll("[^a-zA-Z]","").length());


        //Third solution
        String text3="Hi, my name is Yunus.";
        int count2=0;
        for (int i = 0; i <text.length() ; i++) {
            char activeChar=text.charAt(i);
             if(Character.isAlphabetic(activeChar)) count2++;
        }
        System.out.println("count = " + count);



    }
}
