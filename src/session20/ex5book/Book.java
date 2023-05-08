package session20.ex5book;

public class Book {
    public String name;
    public int theNumberOfPages;
    public double price;
    public String author;

    public Book(String name, int theNumberOfPages, double price, String author) {
        this.name = name;
        this.theNumberOfPages = theNumberOfPages;
        this.price = price;
        this.author = author;
    }


    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", theNumberOfPages=" + theNumberOfPages +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
