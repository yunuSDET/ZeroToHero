package session15;

public class Ex10 {

    public static void main(String[] args) {
//*Armstrong number is a number that is equal to the sum of cubes of its digits.
//List all armstrong numbers from 1 to 100_000

        int counter=0;


        for (int i = 1; i <100_000 ; i++) {

            if(isArmstrong(i)){
                counter++;
                System.out.println(i);
            }

        }

        System.out.println(counter);


    }


    public static boolean isArmstrong(int number){

        int temp=number;
        int sumOfCubesOfDigits=0;

        while(temp>0){ //1
            sumOfCubesOfDigits+=(temp % 10)*(temp % 10)*(temp % 10);   //Math.pow((temp % 10),3);
            temp/=10;
        }

        return  (sumOfCubesOfDigits==number) ? true:false;


    }

}
