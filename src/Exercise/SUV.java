package Exercise;

public class SUV extends Car {
    private int roadService;

    public SUV( int roadService) {
        super("SUV", "4 wheels", 5, 5, 6, false);
        this.roadService = roadService;
    }
    public void accelerate(int rate){
        int newVelocity = getVelocity()+rate;
        if (newVelocity==0){
            stop();
            changeGear(1);
        } else if (newVelocity >0 && newVelocity<10){
            changeGear(1);
        }else if (newVelocity>=10 && newVelocity<20){
            changeGear(2);
        }
        else {
            changeGear(4);
        }
        if (newVelocity>0){
            changeVelocity(newVelocity, getDirection());
        }



    }
}
