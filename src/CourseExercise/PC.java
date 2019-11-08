package CourseExercise;

import Exercise.Dimensions;
import Exercise.Resolution;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }

    public static void main(String[] args) {
        Resolution resolution1 = new Resolution(23,34);
        Dimensions dimensions1 = new Dimensions(34,45,78);
        Motherboard motherboard1 = new Motherboard("model1", "Dell", 4,6,"bios1");
        Monitor monitor1 = new Monitor("ar45", "Dell", 34, new Resolution(45, 23));
        Case case1 =new Case("model1", "Dell", 240, dimensions1);

        PC myPC = new PC(case1, monitor1, motherboard1);

        myPC.getTheMonitor().drawPixel(23,34, "Blue");
        myPC.getTheCase().pressPowerButton();
        myPC.getTheMotherboard().loadProgram("Diablo");



    }
}
