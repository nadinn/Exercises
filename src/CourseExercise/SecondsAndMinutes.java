package CourseExercise;

/**
 * program to calculate the hh mm ss given mm and ss or just ss
 */

public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "invalid values";
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));

    }

    /**
     *
     * @param minutes
     * @param seconds
     * @return
     */
    public static String getDurationString(int minutes, int seconds){
        if((minutes>=0) && (seconds>=0 && seconds<=59)){
            int hours = minutes/60;
            minutes=minutes%60;
           return hours+"HH "+ minutes+ "MM "+ seconds+ "SS";

        } else{
            return INVALID_VALUE_MESSAGE;
        }

    }

    /**
     *
     * @param seconds
     * @return
     */
    public static String getDurationString(int seconds){
        if (seconds>=0){
            int minutes = seconds/60;
            seconds=seconds%60;
           String result = getDurationString(minutes, seconds);
           return result;

        }else {
            return INVALID_VALUE_MESSAGE;
        }

    }
}
