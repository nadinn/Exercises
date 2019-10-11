package CourseExercise;

/**
 * program that transforms minutes into years and days
 */

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays( 561600);
    }

    /**
     *
     * @param minutes inputted minuted to be transformed
     */
    public static void printYearsAndDays(long minutes){
        if (minutes<=0){
            System.out.println("invalid value");
        } else {
            long hours = minutes /60;
            minutes= minutes/60;
            long days = hours/24;
            hours = hours%24;
            long years = days/365;
            days=days%365;
            System.out.println(years+ " YY, "+ days +" DD ");

        }
    }
}
