package Exercise;

public class Lamp {
    private String style;
    private boolean battery;
    private int rating;

    public Lamp(String style, boolean battery, int rating) {
        this.style = style;
        this.battery = battery;
        this.rating = rating;
    }
    public void turnOn(){
        System.out.println("Lamp -> turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getRating() {
        return rating;
    }
}
