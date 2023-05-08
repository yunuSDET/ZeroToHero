package session20.ex2phone;

public class PhoneNumber {
    public String firstName,lastName,phoneNumber;

    public PhoneNumber(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    public String toString() {
        return "PhoneNumber{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
