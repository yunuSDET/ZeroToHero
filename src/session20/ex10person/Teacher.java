package session20.ex10person;

public class Teacher extends Person{
    private String schoolName;
    private double salary;

    public Teacher(String firstName, String lastName, int age, char gender, String schoolName,double salary) {
        super(firstName, lastName, age, gender);
        this.schoolName = schoolName;
        this.salary = salary;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(!schoolName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid school name");
            return;
        }
        this.schoolName = schoolName;
    }




    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.out.println("Invalid salary");
            return;
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getFirstName()+" is working in school.");
    }



}
