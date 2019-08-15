/*
program that reads a double value from the user.
• If the value is positive, request a second value. Print the difference between
these two numbers so that the difference is always positive.
• If the first value read is negative, print its positive equivalent.
• If the first value is not a number, give appropriate error message.
 */
package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Positive {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);
        double first = 0;
        System.out.println("Please enter first number ");
        boolean finished = false;

        while (!finished) {
            try {
                first = sc.nextDouble();
                finished=true;

            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("please enter a valid number ");
            }
        }

        if (first > 0) {
            System.out.println("Please enter second number ");
            double second = sc.nextDouble();
            double difference = first - second;
            difference = Math.abs(difference);
            System.out.println("The difference is= " + difference);
        } else if (first < 0) {
            first = Math.abs(first);
            System.out.println("Positive equivalent is= " + first);
        }
    }
}