package session20.ex10person;

public class Person {
    private String firstName,lastName;
    private int age;
    private char gender;


    public Person(String firstName, String lastName, int age, char gender) {
        setFirstName(firstName);
        setFirstName(lastName);
        setAge(age);
        setGender(gender);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(!firstName.matches("[a-zA-Z]+")){
            System.out.println("Invalid first name");
            return;
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(!lastName.matches("[a-zA-Z]+")){
            System.out.println("Invalid last name");
            return;
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'|| gender=='F')){
            System.out.println("Invalid gender.");
            return;
        }
        this.gender = gender;
    }

    public void eat(){
        System.out.println(firstName + " is eating.");
    }

    public void speak(){
        System.out.println(firstName + " is speaking.");
    }

    public void sleep(){
        System.out.println(firstName + " is sleeping.");
    }



    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
