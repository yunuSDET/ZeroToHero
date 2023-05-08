package session20.ex8Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class School {
    public static ArrayList<Teacher> teachers;
    public static void main(String[] args) {

        School school=new School();

        System.out.println("Last Name With M Letter :\n"+school.getLastNamesWithM());
        System.out.println("Teachers smaller than 30 :\n"+school.getTeachersSmallerThan30());
        System.out.println("Female Teachers :\n"+school.getFemaleTeachers());
        System.out.println("Teachers born in 67 :\n"+school.getTeachersBornIn67());

    }

static {

    Teacher teacher1=new Teacher("Yunus","Külcü",'M', LocalDate.of(1980,9,12),12345);
    Teacher teacher2=new Teacher("Ayse","Pek",'F', LocalDate.of(1967,7,28),38383);
    Teacher teacher3=new Teacher("Emir","Maya",'M', LocalDate.of(1992,12,30),7578);
    Teacher teacher4=new Teacher("Ümmühan","Fidan",'F', LocalDate.of(2000,2,19),75757441);

    teachers=new ArrayList<>(Arrays.asList(teacher1,teacher2,teacher3,teacher4));



}


public ArrayList<Teacher> getLastNamesWithM(){
        return teachers.stream().filter(i->i.lastName.startsWith("M")).collect(Collectors.toCollection(ArrayList::new));
}

    public ArrayList<Teacher> getFemaleTeachers(){
        return teachers.stream().filter(i->i.gender=='F').collect(Collectors.toCollection(ArrayList::new));

    }

    public ArrayList<Teacher> getTeachersSmallerThan30(){
        return teachers.stream().filter(i->i.age<30).collect(Collectors.toCollection(ArrayList::new));
    }


    public ArrayList<Teacher> getTeachersBornIn67(){
        return teachers.stream().filter(i->i.dateOfBirth.getYear()==1967).collect(Collectors.toCollection(ArrayList::new));
    }



}
