package session21.ex6library;

public class Book {
    private String title;
    private String author;
    private int publicationYear;


    public Book(String title, String author, int publicationYear) {
        setTitle(title);
        setAuthor(author);
        setPublicationYear(publicationYear);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        if(title.isBlank()) return;
        this.title = title;
    }

    public void setAuthor(String author) {
        if(author.isBlank()) return;
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        if(publicationYear<0 || publicationYear>3000) return;
        this.publicationYear = publicationYear;
    }

    public String getInfo(){
        return title+" "+author + " "+publicationYear;
    }



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }


}
