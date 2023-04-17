package session08;

import java.util.Random;

public class Ex3 {

    public static void main(String[] args) {
        //*Write 100 random five-letter words. They do not need to be meaningful
        Random random=new Random();

        String letters="";

        for (char i = 'a'; i <='z' ; i++) {
            letters+=i;
        }

        for (char i = 'A'; i <='Z' ; i++) {
            letters+=i;
        }



        for (int i = 0; i <1000000 ; i++) {
            String word="";
            for (int j = 0; j <5 ; j++) {
                word+=letters.charAt(random.nextInt(letters.length()));
            }
            System.out.println(word);
        }




    }
}
