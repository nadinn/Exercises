package CourseExercise;

import Exercise.Dimensions;

public class Case {
    private String model;
    private String manufacturer;
    private int power;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, int power, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.power = power;
        this.dimensions = dimensions;
    }
    public void pressPowerButton(){
        System.out.println("power button pressed ");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPower() {
        return power;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
