package session20.ex2phone;

import java.util.ArrayList;

public class Contacts {
    public ArrayList<PhoneNumber> phoneNumbers=new ArrayList<>();

    public void addPhoneNumber(String firstName,String lastName,String phoneNumber){
        phoneNumbers.add(new PhoneNumber(firstName,lastName,phoneNumber));
    }

    public void removePhoneNumber(String firstName,String lastName){
        phoneNumbers.removeIf(i->i.firstName.equals(firstName) && i.lastName.equals(lastName));

    }

    public void call(int index){
                System.out.println(phoneNumbers.get(index).firstName+" "+phoneNumbers.get(index).phoneNumber+" is being called.");
    }



    public String toString() {
        return "Contacts{" +
                "phoneNumbers=" + phoneNumbers +
                '}';
    }
}
