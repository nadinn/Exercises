package Exercise;

public class Vehicle {
    private String name;
    private String size;
    private int velocity;
    private int direction;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.velocity=0;
        this.direction=0;
    }
    public void steer(int direction){
        this.direction +=direction;
        System.out.println("Vehicle.steer() called, steering at "+ this.direction + " degrees");
    }

    public void move(int velocity, int direction){
        this.direction=direction;
        this.velocity=velocity;
        System.out.println("vehicle.move() called, moving at velocity " + this.velocity + " in direction "+ this.direction + " degrees");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDirection() {
        return direction;
    }

    public void stop(){
        velocity=0;
    }
}
