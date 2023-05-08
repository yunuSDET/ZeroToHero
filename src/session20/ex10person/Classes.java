package session20.ex10person;

import java.util.ArrayList;

public class Classes {
    private String className;
    private Teacher teacher;
    private ArrayList<Student> students;


    public Classes(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }


    public void addStudent(String firstName, String lastName, int age, char gender, String schoolName,char grade){
        students.add(new Student(firstName,lastName,age,gender,schoolName,grade));

    }

    public void removeStudent(String firstName, String lastName){
        students.removeIf(i->i.getFirstName().equals(firstName) && i.getLastName().equals(lastName));
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        if(!className.matches("[a-zA-Z]+")){
            System.out.println("Invalid class name");
            return;
        }
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


}
