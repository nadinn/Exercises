package CourseExercise;

public class Fish extends  Animal {
    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weigh, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weigh);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    public void rest(){

    }
    public void swim(int speed){
        moveBackFin();
        moveMuscles();
        super.move(speed);

    }
    public void moveMuscles(){

    }
    public void moveBackFin(){

    }
}
