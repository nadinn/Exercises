package Exercise;

public class ChainConstructor {
    private String name;
    private String email;
    private int number;
    private int idNumber;

    // constructor 1
    public ChainConstructor(String name, String email, int number, int idNumberi){
        this.name=name;
        this.email = email;
        this.number = number;
        this.idNumber = idNumber;

    }
    // constructor 2, chaining to constructor 1 by keyword "this"
    public ChainConstructor(){
        // "this" has to be the first line in the constructor
        this("default name", "default email", 0000, 0000);
    }

}
