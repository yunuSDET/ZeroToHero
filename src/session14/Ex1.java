package session14;

public class Ex1 {


    public static void main(String[] args) {
//*Find the sum of all numbers starting from 1 up to the point where the sum reaches the largest possible integer value

        int sum=0;

        for (int i = 0; i <Integer.MAX_VALUE ; i++) {

            if(Integer.MAX_VALUE-sum>i){
                sum+=i;
            }else{
                System.out.println(i);
                break;
            }

        }

        System.out.println(sum);


    }
}
