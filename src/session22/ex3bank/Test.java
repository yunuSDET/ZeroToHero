package session22.ex3bank;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Bank bank=new Bank();

        Scanner input=new Scanner(System.in);

        boolean quit=true;
        while (quit){

            System.out.println("Input selection number:" +
                    "\n1)  Create_S_ID_balance" +
                    "\n2)  Create_L_ID_balance" +
                    "\n3)  Create_O_ID_balance" +
                    "\n4)  Create_C_ID_balance" +
                    "\n5)  Increase_ID_cash" +
                    "\n6)  Decrease_ID_cash" +
                    "\n7)  Set_dd_mm_yy" +
                    "\n8)  ShowAccount" +
                    "\n9)  ShowIDs" +
                    "\n10) Sortition" +
                    "\n11) Exit");

            String choice =input.nextLine();
            int id;
            double balance;

            switch (choice){
                case "1":
                    System.out.println("Input Id");
                    id=input.nextInt();
                    System.out.println("Input Balance");
                    balance=input.nextDouble();
                    bank.Create_S_ID_balance(id,balance);
                    input.nextLine();
                    break;

                case "2":
                    System.out.println("Input Id");
                    id=input.nextInt();
                    System.out.println("Input Balance");
                    balance=input.nextDouble();
                    bank.Create_L_ID_balance(id,balance);
                    input.nextLine();
                    break;

                case "3":
                    System.out.println("Input Id");
                    id=input.nextInt();
                    System.out.println("Input Balance");
                    balance=input.nextDouble();
                    bank.Create_O_ID_balance(id,balance);
                    input.nextLine();
                    break;


                case "4":
                    System.out.println("Input Id");
                    id=input.nextInt();
                    System.out.println("Input Balance");
                    balance=input.nextDouble();
                    bank.Create_C_ID_balance(id,balance);
                    input.nextLine();
                    break;

                case "5":
                    System.out.println("Input Id");
                    id=input.nextInt();
                    System.out.println("Input Balance");
                    balance=input.nextDouble();
                    bank.deposit(id,balance);
                    input.nextLine();
                    break;

                case "6":
                    System.out.println("Input Id");
                    id=input.nextInt();
                    System.out.println("Input Balance");
                    balance=input.nextDouble();
                    bank.withdraw(id,balance);
                    input.nextLine();
                    break;

                case "7":
                    System.out.println("Input Day");
                    int day=input.nextInt();
                    System.out.println("Input Month");
                    int month=input.nextInt();
                    System.out.println("Input Year");
                    int year=input.nextInt();
                    bank.setDate(day,month,year);
                    input.nextLine();
                    break;


                case "8":
                    bank.showAccount();
                    break;

                case "9":
                    bank.showIDs();
                    break;

                case "10":
                    bank.sortition();
                    break;


                case "11":
                    quit=false;
                    break;

                default:
                    System.out.println("Invalid choice");

            }


        }



    }
}
