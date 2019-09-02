package Exercise;

public class BedroomTest {
    public static void main (String args[]){
        Wall w1 = new Wall("east");
        Wall w2 = new Wall("south");
        Wall w3 = new Wall ("west");
        Wall w4 = new Wall ("north");
        Ceiling ceiling = new Ceiling(5,67);
        Bed bed = new Bed("modern", 4,5,3,4);
        Lamp lamp = new Lamp("modern", true,5);

        Bedroom bedroom = new Bedroom("benroom",w1,w2,w3,w4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
        bedroom.turnLamp();
        bedroom.makeBed2().make();

    }
}
