package session20.ex7employee;

public class Employee {
    public String firstName,lastName;
    public char gender;
    public double salary;


    public Employee(String firstName, String lastName, char gender, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
