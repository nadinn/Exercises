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

    public String toString(){
        return author+ " "+title+" "+" "+publisher;
    }
    //implemented due to abstract method in superclass Book
    public void printAll(){
        System.out.println("textbook author " + this.author);
        System.out.println("title "+ this.title);
        System.out.println("isbn "+ this.isbn);
        System.out.println("language "+ this.publisher);
        System.out.println();

    }

}

