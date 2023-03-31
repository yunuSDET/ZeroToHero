package day5;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
 //"Create a password using the first name and last name information obtained
        // from the user as follows:
        // Concatenate the first letter of the name as a capital letter and
        // the first letter of the last name as a capital letter,
        // then add the phrase '+1234' to the end.
        //Example Input: Ahmet Temel, Output: AT+1234"

        Scanner input =new Scanner(System.in);

        System.out.println("Input first name :");
        String firstName=input.next();

        System.out.println("Input last name :");
        String lastName=input.next();

        String firstLetterOfFirstName=String.valueOf(firstName.charAt(0)).toUpperCase();
        String firstLetterOfLastName=String.valueOf(lastName.charAt(0)).toUpperCase();

        String password=firstLetterOfFirstName+firstLetterOfLastName+"+1234";
        System.out.println("Password = " + password);
        input.close();


    }
}
