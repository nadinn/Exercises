package Exercise;

class StaticMethod {
    private static String name;

    public StaticMethod(String name ){
        StaticMethod.name=name;
    }
    public void printName(){
        System.out.println("name "+ name);

    }
}

public class StaticMethodEx{
    public static void main (String args []){
        StaticMethod example1 = new StaticMethod("ex1"); // create an instance ex1
        StaticMethod example2 = new StaticMethod("ex2"); // create an instance ex2
        example1.printName(); // prints ex2
        example2.printName();// prints ex2
    }

}
