package Exercise;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    //constructor
    public MobilePhone (int myNumber){
        this.myNumber=myNumber;
    }

    public int getMyNumber() {
        return myNumber;
    }

    // Overriding all the methods from the Interface
    @Override
    public void powerOn() {
        System.out.println("Phone is turning on");
        isOn=true;

    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now dialing... " + phoneNumber);
        } else {
            System.out.println("Mobile phone is off");
        }

    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println(" Mobile phone has been answered  ");
            isRinging=false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber==myNumber && isOn){
            isRinging=true;
            System.out.println("Ringing on mobile phone " + phoneNumber);
        } else{
            isRinging=false;
            System.out.println("Mobile phone is off");
        }
        return isRinging;
    }

}
