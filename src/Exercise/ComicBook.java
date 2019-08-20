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

}
