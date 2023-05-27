package session21.ex6library;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {

    private ArrayList<Book> books=new ArrayList<>();




public void addBook(String title,String author,int publicationYear){
        books.add(new Book(title,author,publicationYear));
}

public void removeBook(String title){
    books.removeIf(i->i.getTitle().equalsIgnoreCase(title));
}

public ArrayList<Book> searchByAuthor(String author){
    ArrayList<Book> booksByAuthor=new ArrayList<>();
    for (Book eachBook : books) {
        if(eachBook.getAuthor().equalsIgnoreCase(author)){
            booksByAuthor.add(eachBook);
        }
    }
    return booksByAuthor;
    //return books.stream().filter(i->i.getAuthor().equals(author)).collect(Collectors.toCollection(ArrayList::new));
}


public ArrayList<Book> searchByYear(int publicationYear){
    ArrayList<Book> booksPublishedThisYear=new ArrayList<>();
    for (Book eachBook : books) {
        if(eachBook.getPublicationYear()==publicationYear){
            booksPublishedThisYear.add(eachBook);
        }
    }
    return booksPublishedThisYear;
    //return books.stream().filter(i->i.getPublicationYear()==publicationYear).collect(Collectors.toCollection(ArrayList::new));
}





}
