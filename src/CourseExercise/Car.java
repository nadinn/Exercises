package CourseExercise;

public class Car extends Vehicle {
    private int wheels;
    private int gears;
    private int door;
    private boolean isManual;

    public Car(String name, String size, int wheels, int gears, int door, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.gears = gears;
        this.door = door;
        this.isManual = isManual;
    }
    public void changeGear(int gears){
        move(gears*30);
        System.out.println("Car.changeGear called "+ " /gear "+ gears);

    }
}
