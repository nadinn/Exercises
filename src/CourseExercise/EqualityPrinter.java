package CourseExercise;

/**
 * program to determine if 3 integers are all equal, all different or just one different form the other 2
 */

public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(1,2,3);

    }

    /**
     * @param a number 1
     * @param b number 2
     * @param c number 3
     */


    public static void printEqual(int a, int b, int c){
        if (a<0||b<0||c<0){
            System.out.println("invalid input");
        } else if (a==b && a==c){
            System.out.println("all numbers are equal");
        } else if (a!=b && a!=c && c!=b){
            System.out.println("all numbers different");
        } else {
            System.out.println("none of the above ");
        }
    }
}
