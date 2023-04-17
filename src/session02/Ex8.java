package session02;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

//"Get the user's age information.
//If the age is between 1-3, print "baby"
//If the age is between 4-13, print "child"
//If the age is between 14-18, print "teenager"
//If the age is 19 or older, print "adult"

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your age :");
        int age=scanner.nextInt();
        String result="";
        if(age<1){

            if(age<=3){
                result="bayb";
            }else if(age<=13){
                result="child";
            }else if (age<18){
                result="teenager";
            }else{
                result="adult";
            }

        }else{
            result="Invalid";
        }

        System.out.println("result = " + result);

    }
}
