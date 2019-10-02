package CourseExercise;

/**
 * program to calculate if a year is leap or not
 */

public class LeapYear {
    public static void main(String[] args) {
        System.out.println( isLeapYear(2100));
    }

    /**
     *
     * @param year the inputted year that need analysing
     * @return boolean depending on the year being leap or not
     */
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year % 4 ==0 ){
                if (year % 100 ==0){
                    if (year % 400 ==0){
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else{
            return false;
        }
    }

}
