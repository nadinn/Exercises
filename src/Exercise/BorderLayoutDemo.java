package Exercise;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {
    public BorderLayoutDemo(){
        setTitle("title of the frame");
        //ImageIcon i1 = new ImageIcon("m1.jpg");
        Container content = getContentPane();
        content.setLayout(new BorderLayout());
        content.add(BorderLayout.NORTH, new JButton("north"));
        content.add(BorderLayout.SOUTH,new JButton("south"));
        content.add(BorderLayout.EAST, new JButton("south"));
        content.add(BorderLayout.WEST, new JButton("west"));
        content.add(BorderLayout.CENTER, new JButton("centre"));

    }
    public static void main (String args[]){
        BorderLayoutDemo bd = new BorderLayoutDemo();
        bd.pack();
        bd.show();
    }

}
