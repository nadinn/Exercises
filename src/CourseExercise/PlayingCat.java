package CourseExercise;

/**
 * cats play if the temperature is between 25 and 35 (inclusive).
 * Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
 */

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 35));
    }

    /**
     *
     * @param summer boolean for summer true or false
     * @param temperature inputted temperature
     * @return boolean to  determine of the cat is playing or not
     */
    public static boolean isCatPlaying(boolean summer, int temperature){
        if ((summer)&&(temperature>=25 && temperature<=45)){
            return true;
        } else if ((!summer)&& (temperature >25 && temperature<=35)){
            return true;
        } else {
            return false;
        }
    }
}
