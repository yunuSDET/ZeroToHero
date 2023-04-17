package session01;

public class Ex5 {

    public static void main(String[] args) {
//Find the sum of the odd numbers from 50,304


        int sum=0;

        for(int i=50;i<304;i++){

            if(i % 2 ==1) sum+=i;

        }

        System.out.println(sum);



    }
}
