/**
 * exercise to convert km to miles
 */
package CourseExercise;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(25.42);

    }

    /**
     * method that converts km to mhp
     * @param km kilometers that need to be converted
     * @return mph miles that have been converted from kilometers
     */
    public static long toMilesPerHour(double km){
      final double converter =0.62137119;
      double mph;
        if (km<=0){
            return -1;
        } else {
            mph= km*converter;
            mph = Math.round(mph);
        }
        return (long) mph;
    }

    /**
     * method that prints the conversion of km to mph
     * @param km kilometers that need to be converted
     */
    public static void printConversion(double km){
        if (toMilesPerHour(km)== -1) {
            System.out.println("invalid input");
        }else {
            System.out.println("km: " + km +" is " + toMilesPerHour(km)+ " miles");
        }

    }
}
