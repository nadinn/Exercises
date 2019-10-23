package CourseExercise;

import java.util.Scanner;

/**
 * program to determine what scanner user input int is the max and the min,
 * infinite while loop will keep taking ints until the user enters a non int, breaking the loop
 */

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;

        int max=0; // initialising the variables
        int min=0;
        boolean firstInput = true;

        while (true){   // infinite loop broken by non int input
            System.out.println("enter a number");
            if(sc.hasNextInt()){
                temp=sc.nextInt();

                if(firstInput){  // this loop will execute only once with the first input to assign user values to min and max
                    max=temp;
                    min=temp;
                    firstInput=false;
                }

                if (temp>max ){
                    max=temp;
                } else if(temp<min){
                    min=temp;
                }
            } else {  // if not an int
                break;
            }
        }
        System.out.println("max= " + max + " min = "+ min);
    }
}
