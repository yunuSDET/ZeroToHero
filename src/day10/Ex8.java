package day10;

public class Ex8 {

    public static void main(String[] args) {
        //A number is called an Armstrong number
        // if it is equal to the cube of its every digit.
        // For example, 153 is an Armstrong number because of 153= 1+ 125+27,
        // which is equal to 1^3+5^3+3^3. You need to write a program to check
        // if the given number is Armstrong number or not.

        int number =153;


        int sumOfCubeOfDigits=0;
        int temp=number;


        while (temp>0){
            int digit=temp % 10;
            sumOfCubeOfDigits+=digit*digit*digit;
            temp/=10;
        }


        if(number== sumOfCubeOfDigits){
            System.out.println(number+" is an armstrong number");
        }else{
            System.out.println(number+" is not an armstrong number");
        }


    }
}
