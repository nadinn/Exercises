package Exercise;

import java.text.DecimalFormat;
import java.util.Random;

public class StudentMarks {
    public double[] marks = new double[7];
    Random rn = new Random();
    DecimalFormat df = new DecimalFormat("#.##");

    // constructor populates automatically the array with random marks when class is initialised
    public StudentMarks(){
        for(int i = 0; i<this.marks.length; i++){
            this.marks[i]=rn.nextDouble()*100;
        }
    }
    // printing out the marks individually
    public void getMarks(){
        System.out.println("The marks are: ");
        for ( int i = 0; i<this.marks.length ; i++){
            System.out.print( df.format(this.marks[i]) + "  " );
        }
    }

     // getting a specific marks at a position specified
     public double getSpecificMark(int pos){
        return this.marks[pos];
     }
     //setting a specified mark at a specified position
     public void setMark(int pos, double mark){
        this.marks[pos]=mark;
     }
     // returns the mean of all the marks
     public double meanMarks(){
        double mean = 0;
        double sum = 0;
        for (int i =0; i<this.marks.length; i++){
            sum = sum+this.marks[i];
        }
        mean= sum/this.marks.length;
        return mean;
     }
     public int highestPos(){
        double high = this.marks[0];
        int maxIndex=0;
        for( int i = 0; i<this.marks.length; i++) {
            if (this.marks[i] > high) {
                high=this.marks[i];
                maxIndex=i;
            }
        }
        return maxIndex;
     }

}
