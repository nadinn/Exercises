package Exercise;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomArray {
    public int [] myArray;
    public int size;
    Random rn = new Random();
    int sum;
    double mean;

    public void populateArray(int size){
        this.size=size;
        this.myArray=new int [size];
        for (int i=0; i<size; i++){
            this.myArray[i]=rn.nextInt(((100-0)+1)+0);
        }
    }
    public void printArray(){
        for (int i = 0; i<size; i++){
            System.out.print(this.myArray[i] + " ");
        }
    }
    public int calcSum(){
        int sum=0;
        for(int i =0; i<this.size; i++){
            sum = sum+ this.myArray[i];
        }
        this.sum=sum;
        return sum;
    }
    public double calcMean(){
        double mean =(double)this.calcSum()/(double)this.size;  // casting size as double to avoid truncation
        this.mean = mean;
        return mean;
    }

    public static void main(String args[]){
        int sizeArray = Integer.parseInt(args[0]);
        RandomArray newR = new RandomArray();
        DecimalFormat df = new DecimalFormat("#.##"); // setting the pattern to 2 decimal places
        newR.populateArray(sizeArray);
        System.out.println("Printing array: ");
        newR.printArray();
        System.out.println();
        System.out.println();
        System.out.println("The sum is " +newR.calcSum());
        System.out.println("The mean is " + df.format(newR.calcMean())); // using DecimalFormat class to truncate to 2 dp

    }


}
