package session20.ex10person;

public class Test {

    public static void main(String[] args) {

        Classes class1 = new Classes("2A", new Teacher("yunus", "külcü", 39, 'M', "Ataturk Primary School", 94000));
        class1.addStudent("ad1", "soyad1", 12, 'F', "Ataturk Primary School", 'A');
        class1.addStudent("ad2", "soyad2", 9, 'M', "Ataturk Primary School", 'B');
        class1.addStudent("ad3", "soyad3", 11, 'F', "Ataturk Primary School", 'A');
        class1.addStudent("ad4", "soyad4", 10, 'M', "Ataturk Primary School", 'C');
        class1.addStudent("ad5", "soyad5", 8, 'F', "Ataturk Primary School", 'D');
        class1.addStudent("ad6", "soyad6", 14, 'M', "Ataturk Primary School", 'F');


        System.out.println("Male students are studying.");
        class1.getStudents().stream().filter(i->i.getGender()=='M').forEach(Student::study);


        System.out.println("Female students are speaking.");
        class1.getStudents().stream().filter(i->i.getGender()=='F').forEach(Student::speak);


        System.out.println("Hard working students are sleeping.");
        class1.getStudents().stream().filter(i->i.getGrade()=='A').forEach(Student::sleep);

        System.out.println("Mealtime");
        if(class1.getTeacher().getGender()=='M'){
            class1.getStudents().forEach(Student::eat);
        }else{
            class1.getTeacher().eat();
        }


    }
}
