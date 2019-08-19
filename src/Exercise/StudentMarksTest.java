package Exercise;

import java.text.DecimalFormat;

public class StudentMarksTest {
    public static void main (String args []){
        DecimalFormat df = new DecimalFormat("#.##");
        StudentMarks st = new StudentMarks();
        int pos = 3;

        st.getMarks(); // printing all the marks
        System.out.println();

        System.out.println("The mark at position "+ pos+ " is: "+ df.format(st.getSpecificMark(pos))); // getting a marks
        st.setMark(2, 80);  // setting a new mark at a specified position

        System.out.println("The new marks are: ");
        st.getMarks(); // testing the new mark position
        System.out.println();
        System.out.println("The mean of the marks is: " + df.format(st.meanMarks()));
        System.out.println("The position of the highest marks is: " + st.highestPos());


    }
}
