package day2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
//1) Get the name of the user
//2) Print the name of the user in order 100 times on the screen
//Example:

//1.ahmet
//2.ahmet
//...
//100.ahmet

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input your name :");
        String name=scanner.nextLine();

        for (int i = 1; i <=100 ; i++) {
            System.out.println(i+". "+name);
        }





    }
}
