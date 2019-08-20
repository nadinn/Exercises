package Exercise;

public class Textbook extends Book{
    protected String publisher;

    public Textbook(String author, String title, String isbn, String publisher) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;

    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void printPublisher() {
        System.out.println("Publisher: " + publisher);
    }

}

