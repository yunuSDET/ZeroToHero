package day10;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        //*Take a ten-digit Phone number and print it like this:
        //(541) 340 54 92

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your phone number :");
        String phoneNumber=input.nextLine();


//        while(phoneNumber.length()!=10){
//            System.out.println("Phone number must have 10 digits");
//            phoneNumber=input.nextLine();
//        }


        String newPhoneNumber="("+phoneNumber.substring(0,3)+") "+phoneNumber.substring(3,6)+
                " "+phoneNumber.substring(6,8)+" "+phoneNumber.substring(8);


        System.out.println("Phone number = " + newPhoneNumber);

    }
}
