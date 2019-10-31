package CourseExercise;

public class Sedan extends Car {
    private boolean insured;
    public Sedan(boolean insured) {
        super("Sedan", "medium", 4, 5, 5, false);
        this.insured=insured;
    }
    public void accelerate(int rate){
        int newVelocity = rate*getVelocity();
        if (newVelocity==0){
            super.stop();
        } else {
            System.out.println("New velocity is " + newVelocity);
        }
    }

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(true);
        System.out.println("Size of the car: "+sedan1.getSize());
        sedan1.steer("North");
        sedan1.move(25);
        sedan1.accelerate(3);
    }
}
