package CourseExercise;

/**
 * program for a simple calculator
 */

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getSum(){
        double sum = getFirstNumber()+ getSecondNumber();
        return sum;
    }
    public double getSubtraction(){
        double subtraction= getFirstNumber()-getSecondNumber();
        return subtraction;
    }
    public double getMultiplication(){
        double multiplication = getFirstNumber()*getSecondNumber();
        return multiplication;
    }
    public double getDivision(){
        double division = getFirstNumber()/getSecondNumber();
        return division;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(20);
        calculator.setSecondNumber(5);
        System.out.println(calculator.getSum() + " "+ calculator.getSubtraction() +" "+ calculator.getMultiplication() +" "+ calculator.getDivision());

    }
}
