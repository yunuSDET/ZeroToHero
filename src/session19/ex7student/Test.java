package session19.ex7student;

public class Test {

    public static void main(String[] args) {

        Classes class1=new Classes("2B","Yunus Külcü");
        Classes class2=new Classes("3B","Ahmet Külcü");

        Student s1=new Student("yusuf","kara",234,'M');
        Student s2=new Student("ali","yar",14,'M');
        Student s3=new Student("ayse","sevda",754,'F');
        Student s4= new Student("fatma","kaya",412,'F');
        Student s5=new Student("burak","sev",557,'M');



        class1.addStudent(s1);
        class1.addStudent(s2);
        class1.addStudent(s3);
        class2.addStudent(s4);
        class2.addStudent(s5);


    }
}
