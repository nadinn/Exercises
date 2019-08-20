package Exercise;

public class ComicBook extends Book {
    protected String illustrator;
    public ComicBook(String author, String title, String isbn, String illustrator) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.illustrator = illustrator;

    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return this.illustrator;
    }

    public void printIllustrator() {
        System.out.println("Illustrator: " + illustrator);
    }

    public String toString(){
        return author+ " "+title+" " +illustrator;
    }
    //implemented due to abstract method in superclass Book
    public void printAll(){
        System.out.println("comic book author " + this.author);
        System.out.println("title "+ this.title);
        System.out.println("isbn "+ this.isbn);
        System.out.println("language "+ this.illustrator);
        System.out.println();
    }

}
