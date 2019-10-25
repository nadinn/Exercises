package CourseExercise;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weigh;

    public Animal(String name, int brain, int body, int size, int weigh) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weigh = weigh;
    }

    public void eat(){
        System.out.println("Animal.eat() called ");

    }
    public void move(int speed){
        System.out.println("Animal.move() called - Animal is moving at "+ speed);

    }

    //getters
    public String getName() {
        return name;
    }
    public int getBrain() {
        return brain;
    }
    public int getBody() {
        return body;
    }
    public int getSize() {
        return size;
    }
    public int getWeigh() {
        return weigh;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setBrain(int brain) {
        this.brain = brain;
    }
    public void setBody(int body) {
        this.body = body;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

}
