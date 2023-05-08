package session20.ex10person;

public class Student extends Person{
        private String schoolName;
        private char grade;

    public Student(String firstName, String lastName, int age, char gender, String schoolName,char grade) {
        super(firstName, lastName, age, gender);
        this.schoolName = schoolName;

        this.grade = grade;
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
