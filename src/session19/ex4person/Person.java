package session19.ex4person;
/*Create a class named Person
 instances: firstName,lastName,age
 a contructor: sets all fields
 actions: toString
 Create a test class named TestPerson
 create 5 person and add them into an ArrayList
 print persons who are older than 25 to console*/

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
