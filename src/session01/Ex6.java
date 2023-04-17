package session01;

public class Ex6 {

    public static void main(String[] args) {
////Find the average of numbers from 56 to 203;
        int sum=0;
        int count=0;

        for(int i=56;i<=203;i++){
            sum+=i;
            count++;
        }
        System.out.println((double)sum/count);




    }
}
