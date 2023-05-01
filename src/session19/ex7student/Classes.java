package session19.ex7student;

import java.util.ArrayList;

public class Classes {
    public ArrayList<Student> students=new ArrayList<>();
    public  String className;
    public  String teacherName;


    public Classes(String className, String teacherName) {
        this.className = className;
        this.teacherName = teacherName;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }


    public String toString() {
        return "Classes{" +
                "students=" + students +
                ", class name=" + className +
                ", teacher name=" + teacherName +
                '}';
    }
}
