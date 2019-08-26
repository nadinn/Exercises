package Exercise;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int legs, int teeth, String coat) { // adding the extra attributes to the constructor
        super(name, 1, 1, size, weight); //setting the brain and body to an int and deleting them from the parameters in
        this.tail=1; // all dogs created will have 1 tail
        this.eyes=2; // and 2 eyes
        this.teeth = teeth; // the rest is specified by the caller
        this.legs=legs;
        this.coat=coat;
    }
    public void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        super.move(10);
    }
    public  void bark(int times){
        System.out.println(getName()+ " is barking " + times + " times");
    }
    public void wagTail (int times){
        System.out.println(getName()+ " is wagging tail "+ times + " times");
    }
    public void interact(){
        bark(4);
        wagTail(3);
        System.out.println(getName() +" is interacting ");
    }


}
