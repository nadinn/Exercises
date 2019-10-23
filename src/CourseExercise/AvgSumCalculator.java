package CourseExercise;
/**
 * program to calculate the sum and avg of the ints from user input
 * an infinite loop is used that breaks only when the user inputs an non int
 */

import java.util.Scanner;

public class AvgSumCalculator {

    public static void main(String[] args) {
    calculate();

    }
    public static void calculate (){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int sum =0;
        double avg =0.0;
        while (true){
            System.out.println("input number");
            if (sc.hasNextInt()){
                sum=sum+sc.nextInt();
                count=count+1;
            } else{
                System.out.println("invalid input");
                break;
            }

        }
        avg=sum/count;
        System.out.println("Sum is " + sum + " avg is " + avg);

    }
}
