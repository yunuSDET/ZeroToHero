package session20.ex5book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class BookTest {

    public static void main(String[] args) {


        Book book1=new Book("Problems in Math",196,15,"author1");
        Book book2=new Book("Turkish",148,35,"author2");
        Book book3=new Book("New Generation Problems",196,25,"author1");
        Book book4=new Book("English Journey",240,100,"author3");
        Book book5=new Book("Learning English",148,75,"author3");
        Book book6=new Book("Love in Life",144,12,"author4");
        Book book7=new Book("Don't Let Me Down",96,10,"author4");

        ArrayList<Book> books=new ArrayList<>(Arrays.asList(book1,book2,book3,book4,book5,book6,book7));


        double max=books.get(0).price;
        double min=books.get(0).price;

        for (Book each : books) {
            if(max<each.price) max=each.price;
            if(min>each.price) min=each.price;
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("\n\nBooks which are expensive than $20");
        books.stream().filter(i->i.price>20).forEach(System.out::println);

        String authorName="author3";
        System.out.println("\n\nThe books which were written by "+authorName);
        books.stream().filter(i->i.author.equals(authorName)).forEach(System.out::println);








    }
}
