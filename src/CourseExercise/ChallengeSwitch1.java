package CourseExercise;

import java.util.Scanner;

public class ChallengeSwitch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString= sc.next();
        char inputChar = inputString.charAt(0);
        switch (inputChar){
            case 'A': case 'a':
                System.out.println(" A was found");
                break;
            case 'B': case 'b':
                System.out.println(" B was found");
                break;
            case 'C': case 'c':
                System.out.println("C was found");
                break;
            default:
                System.out.println("something else ");

        }

    }
}
