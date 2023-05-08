package session20.ex10person;

public class Test {

    public static void main(String[] args) {

        Classes class1 = new Classes("2A", new Teacher("yunus", "kulcu", 39, 'M', "Ataturk Primary School", 94000));
        class1.addStudent("yunus", "naz", 12, 'F',  'A');
        class1.addStudent("ayse", "engin", 9, 'M',  'B');
        class1.addStudent("burak", "pek", 11, 'F',  'A');
        class1.addStudent("ali", "cavus", 10, 'M', 'C');
        class1.addStudent("mine", "kadi", 8, 'F',  'D');
        class1.addStudent("recep", "gul", 14, 'M',  'F');


        System.out.println("Male students are studying.");
        class1.getStudents().stream().filter(i->i.getGender()=='M').forEach(Student::study);


        System.out.println("Female students are speaking.");
        class1.getStudents().stream().filter(i->i.getGender()=='F').forEach(Student::speak);


        System.out.println("Hard working students are sleeping.");
        class1.getStudents().stream().filter(i->i.getGrade()=='A').forEach(Student::sleep);

        System.out.println("Mealtime");
        if(class1.getTeacher().getGender()=='F'){
            class1.getStudents().forEach(Student::eat);
        }else{
            class1.getTeacher().eat();
        }


    }
}
