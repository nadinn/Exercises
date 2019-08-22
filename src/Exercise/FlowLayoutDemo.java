package Exercise;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    public FlowLayoutDemo(String title, int num){
        this.setTitle(title);
        this.getContentPane().setLayout(new FlowLayout());
        for (int i=0; i<num; i++){
            this.getContentPane().add(new JButton (""+i));
        }
    }
    public static void main (String args []){
        FlowLayoutDemo f1 = new FlowLayoutDemo("title fo frame", 10);
        f1.pack();
        f1.setVisible(true);

    }
}
