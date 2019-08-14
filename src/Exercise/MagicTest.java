/*
game that generates a random integer number 1-100 and asks user to guess the number
the game tells the user if the number entered is too small, too big or they guessed
 */
package Exercise;
import java.util.Scanner;

public class MagicTest {
    public static void main(String args[]) {

        MagicNumber mn = new MagicNumber();      // new MagicNumber object mn
        Scanner sc = new Scanner(System.in);   // new Scanner object
        int counter = 0;   // setting counter to 0

        System.out.println("Testing the random number " + mn.rand);  // random number is shown for testing purposes

        // while loop that will keep asking the user for input till the random number is guessed
        while (mn.rand != mn.number) {
            System.out.println("Please enter your number");   // asking for user input
            int input = sc.nextInt();

            mn.guessNumber(input);   //calling the method from the MagicNumber class
            counter = counter + 1;    // updating the counter for every guess

        }
        System.out.println("Number of tries=  " + counter);    // showing total number of guesses
    }
}



