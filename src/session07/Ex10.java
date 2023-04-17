package session07;

public class Ex10 {

    public static void main(String[] args) {
        //*List all four-digit numbers where the sum of digits equal to 10

        int count=0;

        for (int i = 1000; i <=9999 ; i++) {

            int theSumOfDigits=0;
            int temp=i;

            while(temp>0){ //1
                theSumOfDigits+=temp % 10;
                temp/=10;
            }


            if(theSumOfDigits==10){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("count = " + count);


    }
}
