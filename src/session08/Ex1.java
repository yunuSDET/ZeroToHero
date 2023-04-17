package session08;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
//*Take from the user five names and five ages and print them like example
//Input
//Yunus
//34
//
//Ferhat
//28
//.
//.
//.
//Output
//Yunus is 34 years old.
//Ferhat is 28 years old.
//.
//.
//.
//The older one is Yunus.

        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        int[] ages = new int[5];

        int older = Integer.MIN_VALUE;
        String olderName = "";

        for (int i = 0; i < 5; i++) {

            System.out.print("Enter " + (i + 1) + ". name :");
            names[i] = input.nextLine();

            System.out.print("Enter " + (i + 1) + ". age:");
            ages[i] = input.nextInt();

            input.nextLine();

            if (older < ages[i]) {
                older=ages[i];
                olderName = names[i];
            }

        }
        input.close();
        for (int i = 0; i < ages.length; i++) {
            System.out.println(names[i] + " is " + ages[i] + " years old.");
        }

        System.out.println("\nThe older one is " + olderName);

    }
}
