package Exercise;

import java.util.Random;

public class MagicNumber {
    int max=100;
    int min =1;
    int number;


    Random rn = new Random();
    int rand=rn.nextInt(max-min + 1)+ min;

    public void guessNumber(int number){
            this.number = number;
            if (number > rand) {
                System.out.println("Too big, try again");
                System.out.println();
            } else if (number < rand) {
                System.out.println("Too small, try again");
                System.out.println();
            } else if (number == rand) {
                System.out.println("You guessed");

            }



    }
}
