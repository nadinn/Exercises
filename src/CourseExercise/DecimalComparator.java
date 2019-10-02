package CourseExercise;

/**
 * program to compare two doubles if they are equal up to three decimal places.
 */

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(13.78999, 13.7890);

    }

    /**
     *
     * @param n1 first decimal
     * @param n2 second decimal
     * @return returns a boolean true or false if they are equal or nor
     */
    public static boolean areEqualByThreeDecimalPlaces (double n1, double n2){
        n1 =n1 * 1000;
        n2=n2 * 1000;
        int num1 = (int)n1;
        int num2 = (int)n2;
        if (num1== num2){
            System.out.println("same number up to 3 decimals ");
            return true;

        }else{
            System.out.println("not the same number");
            return  false;
        }
    }
}
