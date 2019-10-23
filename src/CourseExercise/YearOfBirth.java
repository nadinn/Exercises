package CourseExercise;
import java.util.Scanner;

/**
 * simple program that takes as an input a YOB and a name  from a scanner and prints the name and age
 */
public class YearOfBirth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearOfBirth;
        int age;
        String name;
        System.out.println("enter year of birth");
        if(sc.hasNextInt()){   // checking if the value inputted is an integer
            yearOfBirth=sc.nextInt();
            sc.nextLine();  // clearing the line of the scanner
            age=2019- yearOfBirth;

            if (age>=0 && age <=100){
                System.out.println("enter name");
                name=sc.nextLine();
                System.out.println("your name is "+ name + " and you are " + age + " years old");
            } else {
                System.out.println("invalid age, exiting program");
                System.exit(0);
            }
        } else {
            System.out.println("invalid input");
        }
        sc.close();
    }

}
