package CourseExercise;

/**
 * program for calculating the area of a circle and a rectangle, method overloading is used
 */

public class AreaCalculator {
    final static double PI= Math.PI;
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(4,5));

    }

    /**
     * method to calculate the area of a circle given the radius
     * @param radius radius of the circle
     * @return return area of circle or -1.0 if criteria are not met
     */
    public static double area (double radius){
        if (radius<=0){
            return -1.0;
        } else {
            return radius*radius*PI;
        }
    }

    /**
     * methos to calculate the area of a rectangle given x and y
     * @param x rectangle side
     * @param y rectangle side
     * @return area of rectangle or -1.0 if criteria are not met
     */
    public static double area(double x, double y){
        if ( x==0 || y== 0){
            return -1.0;
        } else{
            return x*y;
        }
    }
}
