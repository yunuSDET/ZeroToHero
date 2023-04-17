package session11;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        //*write a program which helps user to find a given four digit password.
        //String password ="1894";
        //Input :1690
        //Output : 1?9?
        //Input :1494
        //Output : 1?94
        //Input :1894
        //Output: Password is correct

        Scanner input = new Scanner(System.in);
        String password = "1894";


        System.out.println("Input password :");


        while (true) {

            String result = "";
            String userInput = input.nextLine();

            if (userInput.equals(password)) {
                System.out.println("Password is correct");
                break;
            }

            for (int i = 0; i < password.length(); i++) {

                if (password.charAt(i) == userInput.charAt(i)) {
                    result += password.charAt(i);
                } else {
                    result += "?";
                }

            }

            System.out.println(result);


        }


    }
}
