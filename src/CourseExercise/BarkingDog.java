/**
 * program to determine if we should wake up and stop the dog from barking depending
 * on the hour of the day
 */
package CourseExercise;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(false, 23);
    }
    /**
     *
     * @param barking boolean to input if the dog is barking or not
     * @param hourOfDay the hour of the day determines if the barking is allowed or not
     * @return true or false for waking up or not
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay>0 && hourOfDay<24){
            if (barking==true){
                if(hourOfDay<8 || hourOfDay>22){
                    System.out.println("wake up!!");
                    return true;

                } else{
                    System.out.println("barking allowed during these hours");
                    return false;
                }
            } else {
                System.out.println("dog is not barking ");
                return false;
                }

        }else {
            System.out.println("invalid hour of day");
            return false;
        }
    }
}
