package Exercise;

public class PCExercise {
    public static void main (String args []){
        Case theCase = new Case("model1", "manufacturer1","2.4v", new Dimensions(3,4,3));
        Monitor theMonitor = new Monitor("model2", "manuf2", 34, new Resolution(7,5));
        Motherboard theMotherboard= new Motherboard("m3", "mn3", 3,5,"45");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.powerUp();

    }
}
