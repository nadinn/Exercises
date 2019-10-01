/**
 * program that converts KB to MB
 */
package CourseExercise;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    /**
     * method that converts the KB to MB
     * @param kiloBytes KB that are converted to MB
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<= 0){
            System.out.println("invalid input");
        }
        else{
            int mb = (int)kiloBytes/1024;
            int kiloBytes2= kiloBytes-(mb*1024);
            System.out.println( kiloBytes+" KB are: " + mb+" MB " +"and " + kiloBytes2+ " KB" );
        }

    }
}
