package Exercise;

import java.util.ArrayList;

public class Bookshelf {

    private ArrayList<Book> bookshelfArrayL;
    private int size;

    // constructor with specified size of the bookshelf arraylist
    public Bookshelf(int size) {
        this.size = size;
        this.bookshelfArrayL = new ArrayList<Book>(size);

    }

    // constructor with default value of 10 as size of arraylist
    public Bookshelf() {
        this.bookshelfArrayL = new ArrayList<Book>(10);
        this.size=10;
    }

    public void printBooks() {
        for (int i = 0; i < bookshelfArrayL.size(); i++) {
            Book book1 = this.bookshelfArrayL.get(i);
            book1.printAll();
        }
    }

    public void addBook(Book book) {
        if (this.bookshelfArrayL.size() < this.size) {

            this.bookshelfArrayL.add(book);
        } else {
            System.out.println("Bookshelf is full");
        }
    }

    public Book findBookWithIsbn(String isbn) {
        for (int i = 0; i < this.bookshelfArrayL.size(); i++) {
            Book book = this.bookshelfArrayL.get(i);
            if (book.getIsbn().equals(isbn)) {
                return book;

            }
        }
        return null;
    }



}
