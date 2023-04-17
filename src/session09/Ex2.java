package session09;

public class Ex2 {

    public static void main(String[] args) {

        //write a program which counts  letters after h in alphabetic order

        String text="Hi friends, My name is Yunus. Hello What is your name?";

        int counter=0;
        for (int i = 0; i <text.length() ; i++) {
            char ch=text.toLowerCase().charAt(i);
           if(ch>'h' && ch<='z') {
               counter++;

           }
        }

        System.out.println(counter);



    }
}
