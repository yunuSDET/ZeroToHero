package session02;

import java.util.Scanner;

public class Ex10 {


    public static void main(String[] args) {
//Create a basic calculator program
//that takes operation and numbers from the user and
// performs the four basic arithmetic operations. (using switch)


        Scanner scanner=new Scanner(System.in);
        System.out.println("Input first number :");
        int number1=scanner.nextInt();

        System.out.println("Input second number :");
        int number2=scanner.nextInt();



        System.out.println("Input operation character :");
        String operator=scanner.next();
        String result="";

        switch (operator){
            case "+":
                result=number1 +" "+operator+" "+number2+ " = "+(number1+number2);
                break;
            case "-":
                result=number1 +" "+operator+" "+number2+ " = "+(number1-number2);
                break;
            case "*":
                result=number1 +" "+operator+" "+number2+ " = "+(number1*number2);
                break;
            case "/":
                result=number1 +" "+operator+" "+number2+ " = "+(number1/number2);
                break;
            default:
                result="Invalid";
        }


        System.out.println(result);














    }
}
