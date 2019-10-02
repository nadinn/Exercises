package CourseExercise;

/**
 * program that checks if the sum of the first two numbers inputted is equal to the third input
 */

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));

    }

    /**
     *
     * @param n1 input 1
     * @param n2 input 2
     * @param n3 input 3
     * @return boolean
     */
    public static boolean hasEqualSum (int n1, int n2, int n3){
        int sum = n1+n2;
        if (sum == n3){
            return true;
        }else {
            return false;
        }
    }
}
