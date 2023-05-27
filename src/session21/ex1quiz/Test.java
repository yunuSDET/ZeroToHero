package session21.ex1quiz;

import java.util.Random;

public class Test {


    public static void main(String[] args) {


        Quiz quiz=new Quiz();
        Random random=new Random();





        for (int i = 0; i < 10; i++) {
           int num1=random.nextInt(10)+1;
            int num2=random.nextInt(10)+1;
            int result=num1*num2;

            quiz.addQuestion(num1+" x "+num2,result+"");

        }


        quiz.play();



    }
}
