package session20.ex10person;

public class Student extends Person{

        private char grade;

    public Student(String firstName, String lastName, int age, char gender, char grade) {
        super(firstName, lastName, age, gender);


        this.grade = grade;
    }







    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='E' || grade=='F')){
            System.out.println("Invalid grade");
            return;
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getFirstName()+" is studying.");
    }


}
