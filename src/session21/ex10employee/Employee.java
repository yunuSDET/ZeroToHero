package session21.ex10employee;

public class Employee {
    private String firstName,lastName;
    private int age;
    private double salary;


    public Employee(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(!firstName.matches("[a-zA-Z ]+")){
            System.err.println("Invalid first name");
            System.exit(0);
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(!lastName.matches("[a-zA-Z ]+")){
            System.err.println("Invalid last name");
            System.exit(0);
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18 || age>65){
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.err.println("Invalid salary");
            System.exit(0);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(firstName+" "+lastName+" is working.");
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
