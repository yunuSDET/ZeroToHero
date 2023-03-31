package day8;

import java.util.Random;

public class Ex7 {

    public static void main(String[] args) {

 //*Create a string which contains only random 10_000 lowercase  characters and
// check if the string contains "you"

        Random random=new Random();
        String text="";
        String alphabet="";

        for (char i = 'a'; i <='z' ; i++) {
            alphabet+=i;
        }

        String alfabe="abcdefghi........";

        for (int i = 0; i <=10_000 ; i++) {

            int randomIndex=random.nextInt(alfabe.length());

            text+=alphabet.charAt(randomIndex);
        }


        System.out.println(text);

        if (text.contains("you")){
            System.out.println("Text contains 'you'");
        }else{
            System.out.println("Text doesn't contain 'you'");
        }



    }
}
