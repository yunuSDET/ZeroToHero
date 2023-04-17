package session02;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
//"1) Get a text from the user
//2) Replace all "a" characters in the text with "o"
//Convert all characters to lowercase
//Print the final result to the screen"

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a text:");

        String text=scanner.nextLine()
                .replace("a","o")
                .toLowerCase();

        System.out.println(text);




    }
}
