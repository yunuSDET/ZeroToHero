package session07;

import java.util.Scanner;

public class Ex7 {
    //"Set a password.
    // The user has 3 attempts to guess the password.
    // If the user finds the password within 3 attempts,
    // print "login successful". If the password is not found after 3 attempts,
    // print "your account has been suspended"."


    public static void main(String[] args) {


     String password="giremezsin";
        Scanner input=new Scanner(System.in);


        for (int i = 0; i <3 ; i++) {
            System.out.print("Input your password :");
            String userInput=input.nextLine();
            if(password.equals(userInput)){
                System.out.println("Login successful");
                break;
            }
            if(i==2) {
                System.out.println("Your account has been suspended");
                break;
            }

        }







    }




}
