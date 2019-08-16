package Exercise;

public class TestBookshelf {
    public static void main (String args[]){
        Bookshelf b1= new Bookshelf(2);
        Bookshelf b2= new Bookshelf();

        b1.addBook("a1","t1","i1");
        b1.addBook("a2","t2","i2");
        b1.addBook("a3","t3","i3");

        b1.printBooks();
        Book book1 = b1.findBookWithIsbn("i8");

        if (book1 != null){
            System.out.println(book1);
        }else {
            System.out.println("book was not found");
        }




    }
}
