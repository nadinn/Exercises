package Exercise;


import javax.swing.*;

public class FrameDemo extends JFrame {
    public FrameDemo(){
        this.setTitle("First Jframe");
        this.setSize(250,100);
        this.setVisible(true);
    }

    public static void main (String args []){
        FrameDemo fr = new FrameDemo();
    }
}
