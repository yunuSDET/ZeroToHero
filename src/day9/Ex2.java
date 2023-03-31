package day9;

public class Ex2 {

    public static void main(String[] args) {

        //write a program which counts  letters after h in alphabetic order

        String text="Hi friends, My name is Yunus. Hello What is your name?";
        String result="";
        int counter=0;
        for (int i = 0; i <text.length() ; i++) {
            char ch=text.toLowerCase().charAt(i);
           if(ch>'h' && ch<='z') {
               counter++;
               //System.out.print(ch);
           }
        }

        System.out.println(counter);



    }
}
