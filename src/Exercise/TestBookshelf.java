package Exercise;

public class TestBookshelf {
    public static void main (String args[]){
        Bookshelf b1= new Bookshelf();
        //Bookshelf b2= new Bookshelf();

        // creating one Textbook
        Textbook ts1 = new Textbook("a1", "textbook1", "i1", "p1");
        b1.addBook(ts1);

        // creating a Novel
        Novel nv1= new Novel("a2","novel2", "i2", "l2","g2");
        b1.addBook(nv1);

        // creating a ComicBook
        ComicBook cb1 = new ComicBook("a3", "comicbook3", "i3", "il3");
        b1.addBook(cb1);

        //b1.addBook("a1","t1","i1");
        //b1.addBook("a2","t2","i2");
        //b1.addBook("a3","t3","i3");

        b1.printBooks();
        System.out.println();
        Book book1 = b1.findBookWithIsbn("i8");

        if (book1 != null){
            System.out.println(book1);
        }else {
            System.out.println("book was not found");
        }




    }
}
