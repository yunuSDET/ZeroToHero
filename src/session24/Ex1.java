package session24;

//How many five-digit numbers are divisible by 3 and 5 but not by 2?
public class Ex1 {

    public static void main(String[] args) {
        int count=0;

        for (int i = 10000; i <=99999 ; i++) {
           if(i % 3==0 && i % 5 == 0 && i % 2 !=0) count++;
        }

        System.out.println(count);



    }
}
