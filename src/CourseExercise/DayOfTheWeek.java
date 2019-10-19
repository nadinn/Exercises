package CourseExercise;

import java.util.Scanner;

/**
 * program to determine the day of the week based on the input of an integer from 1 to 7
 */
public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int inputNumber = sc.nextInt();

        printDaySwitch(inputNumber);

        printDayIf(inputNumber-1);

    }

    /**
     * method using switch statement
     * @param day
     */
    public static void printDaySwitch (int day){
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("wrong number");

        }
    }

    /**
     * method using if statement
     * @param day
     */
    public static void printDayIf(int day){
        if (day==1){
            System.out.println("monday");
        } else if (day==2){
            System.out.println("tuesday");
        } else if(day==3){
            System.out.println("wednesday");
        } else if (day==4){
            System.out.println("thursday");
        } else if (day == 5){
            System.out.println("friday");
        } else if (day == 6){
            System.out.println("saturday");
        } else if (day==7){
            System.out.println("sunday");
        } else {
            System.out.println("wrong input");
        }
    }
}
