package session03;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
//Ask for an ID from the user,
// if the input is 11 characters, print "ID verified",
// otherwise print "Invalid ID".

        Scanner scanner=new Scanner(System.in);
        System.out.println("Input yor ID :");
        String id=scanner.nextLine();

        if(id.length()==11){
            System.out.println("ID verified");
        }else{
            System.out.println("Invalid ID");
        }




    }
}
