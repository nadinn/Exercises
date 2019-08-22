package Exercise;

import javax.swing.*;
import java.awt.*;

public class JLabelDemo extends JFrame {

    public  JLabelDemo(){
        this.setTitle("This is the frame title");
        JLabel label1 = new JLabel("This is the label", SwingConstants.CENTER);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        this.getContentPane().add(label1);
        this.setSize(400, 200);
        this.setVisible(true);
    }
    public static void main (String args[]){
        JLabelDemo jLabelDemo = new JLabelDemo();
    }
}
