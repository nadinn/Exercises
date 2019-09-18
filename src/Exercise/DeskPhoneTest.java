package Exercise;

public class DeskPhoneTest {
    public static void main(String[] args) {
        DeskPhone myPhone = new DeskPhone(121212 );
        System.out.println("The phone number is " + myPhone.getMyNumber());
        myPhone.powerOn();
        myPhone.dial(121212);
        myPhone.callPhone(121212);
        myPhone.answer();
        System.out.println("---------------");
        MobilePhone myMobilePhone = new MobilePhone(131313);
        //myMobilePhone.powerOn();
        myMobilePhone.callPhone(131313);
        myMobilePhone.answer();



    }
}
