package session15;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        //*Take a password from user and Check if it contains only numbers and has 8 digits. If input is valid print "Password is matched" otherwise ask for new input until it is valid.

        Scanner input=new Scanner(System.in);

        while (true){
            System.out.println("Enter your password :");
            String password=input.nextLine();
            if(password.matches("[0-9]{8}")){
                System.out.println("Password is matched");
                break;
            }
        }



    }
}
