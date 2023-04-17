package session01;

public class Ex2 {

    public static void main(String[] args) {
      //find the sum  of digits of the number (236 -> 2+3+6)
        int myNumber=3452;
        int temp=myNumber;
        int sum=0;
        while(temp>0){
            sum+=temp % 10;
            temp/=10;

        }

        System.out.println(sum);

    }
}
