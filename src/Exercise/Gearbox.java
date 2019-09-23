package Exercise;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGear;
   // private int gearNumber; has been renamed below to avoid shadowing
    private int currentGear;

    public Gearbox(int maxGear) {
        this.maxGear = maxGear;
        gears= new ArrayList<Gear>();  // initialising the ArrayList in the constructor
        Gear neutral = new Gear(0,0.0);
    }
    //inner class
    public class Gear{  // created with an instance of the outer class
        private int gearNumber;  // has same name as variable in the outer class, shadowing it, not recommended
        private double ratio;
        //inner class constructor
        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber; // "this" belongs to the Gear class (inner)
            this.ratio = ratio;           // to use a variable of the outer class : Gearbox.gearNumber
        }
        private double driveSpeed (int revs){
            return revs*this.ratio;
        }
    }

    public static void main(String[] args) {
        Gearbox gearbox1 = new Gearbox(4);
        Gearbox.Gear gear1 = gearbox1.new Gear(2,3.4);
        System.out.println(gear1.driveSpeed(200));
    }
}
