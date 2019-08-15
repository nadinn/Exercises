package Exercise;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available = true;

    public void printTitle() {
        System.out.println(title);
    }
    public void printAuthor() {
        System.out.println(author);
    }
    public void printIsbn() {
        System.out.println(isbn);
    }
    //setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    // getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    // renting system
    public void rentBook(){

        if (available){
            System.out.println("You have rented the book" );
            this.available=false;
        }else if (!available){
            System.out.println("Book is not available for rent ");
        }
    }
    // return system
    public void returnBook(){
        if(!available){
            System.out.println("Book returned");
            this.available=true;
        }else if(available){
            System.out.println("Book was not rented");
        }
    }
    //overriding the toString() method
    public String toString(){
        return title + " "+ author + " "+ isbn + " "+ available;

    }

}
        
    


