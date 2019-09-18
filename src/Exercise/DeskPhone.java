package Exercise;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    //constructor
    public DeskPhone (int myNumber){
        this.myNumber=myNumber;
    }

    public int getMyNumber() {
        return myNumber;
    }

    // Overriding all the methods from the Interface
    @Override
    public void powerOn() {
        System.out.println("Phone is turning on");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing... "+ phoneNumber);

    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Phone has been answered  ");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber){
            isRinging=true;
            System.out.println("Ringing " + phoneNumber);
        } else{
            isRinging=false;
        }
        return isRinging;
    }

//    @Override
//    public boolean isRinging() {
//        return false;
//    }
}
