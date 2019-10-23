package CourseExercise;

import java.util.Scanner;

/**
 * program that takes 10 inputs from user through scanner and returns the sum
 */

public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {   // infinite loop that will stop by break when 10 numbers are read
            int order = count + 1;
            System.out.println("enter number " + order);
            if (sc.hasNextInt()) {       // checks if the user has inputted an int
                sum = sum + sc.nextInt();
                count = count + 1;
                if (count == 10) {
                    break;
                }

            } else {
                System.out.println("invalid input ");
                sc.nextLine(); // handles end of line (enter key)/ removes from line
            }

        }
        System.out.println("sum is " + sum);
        sc.close();
    }
}
