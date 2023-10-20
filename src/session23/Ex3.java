package session23;

public class Ex3 {



    /*
    Write a Java Program to swap two numbers without using the third variable.
     */
    public static void main(String[] args) {


        //First solution
        int number1=12;//a
        int number2=19;//b


        number1=number1+number2;//a+b
        number2=number1-number2;//a
        number1=number1-number2;//b

        System.out.println(number1);
        System.out.println(number2);




        //Second solution
       int a=12;
       int b=42;
       a=a*b;
       b=a/b;
       a=a/b;
        System.out.println(a);
        System.out.println(b);







    }
}
