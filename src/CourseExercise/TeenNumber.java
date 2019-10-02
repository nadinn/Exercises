package CourseExercise;

public class TeenNumber {
    public static void main(String[] args) {
        System.out.println(hasTeenNumber(15,14,15));

    }
    public static boolean hasTeenNumber(int n1, int n2, int n3){
        if ((n1>= 13 && n1<=19) || (n2>= 13 && n2<=19) || (n3>= 13 && n3<=19)) {
            return true;
        } else {
            return false;
        }
    }
}
