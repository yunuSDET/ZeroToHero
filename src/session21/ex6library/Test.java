package session21.ex6library;

public class Test {

    public static void main(String[] args) {

        Library library=new Library();

        library.addBook("Kitap1","Yazar1",2000);
        library.addBook("Kitap2","Yazar1",2005);
        library.addBook("Kitap3","Yazar2",2022);
        library.addBook("Kitap4","Yazar2",2005);
        library.addBook("Kitap5","Yazar3",2000);


        System.out.println("Book were written by Yazar1");
        System.out.println(library.searchByAuthor("Yazar1"));
        System.out.println("-".repeat(100));
        System.out.println("Books were published in 2000");
        System.out.println(library.searchByYear(2000));



    }
}
