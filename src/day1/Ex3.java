package day1;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

//Take ten name from user and print them to console
    String[] names=new String[10];
    Scanner scanner =new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.println("Input "+(i+1)+". name");
            names[i]=scanner.nextLine();
        }

        for(String name:names){
            System.out.println(name);
        }


    }
}
