package CourseExercise;

public class Vehicle {
    private String name;
    private String size;
    private int velocity;
    private String direction;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void steer(String direction){
        this.direction=direction;
        System.out.println("Steering towards " + this.direction);
    }
    public void move(int velocity){
        this.velocity=velocity;
        System.out.println("Going at " + this.velocity +"km/h"+ " towards " + this.direction);
    }
    public void stop(){
        this.velocity=0;
    }
    public int getVelocity(){
        return this.velocity;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
