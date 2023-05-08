package session20.ex2phone;

import java.util.Scanner;

public class MyPhone {


    public static void main(String[] args) {

        Contacts contacts=new Contacts();

        contacts.addPhoneNumber("yunus","külcü","12345");
        contacts.addPhoneNumber("burak","yılmaz","5343");
        contacts.addPhoneNumber("ayşe","pek","75454");
        contacts.addPhoneNumber("caglar","gunay","3346343");
        contacts.addPhoneNumber("burak","can","7733423");
        contacts.addPhoneNumber("filiz","akar","577335");

        System.out.println("Choose a number to call");
        for (int i = 0; i < contacts.phoneNumbers.size(); i++) {
            System.out.println(i+1+ "  "+contacts.phoneNumbers.get(i).firstName+" "+contacts.phoneNumbers.get(i).phoneNumber);
        }
        Scanner input =new Scanner(System.in);
        int number=input.nextInt()-1;

        contacts.call(number);




    }
}
