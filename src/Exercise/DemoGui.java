package Exercise;

import javax.swing.*;
import java.awt.*;

public class DemoGui extends JFrame {
    private  JPanel mainPanel, buttonPanel;
    private JTextField field;
    private JLabel label;
    private JButton button;

    public DemoGui(){
        this.setTitle("title of frame");
        field = new JTextField();
        label = new JLabel("you typed");
        button = new JButton("submit text");

        mainPanel = new JPanel(new GridLayout(0,1));
        buttonPanel = new JPanel();
        mainPanel.add(field);
        mainPanel.add(label);
        buttonPanel.add(button);
        Container con = this.getContentPane();
        con.add(mainPanel,BorderLayout.NORTH);
        con.add(buttonPanel,BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);

    }

    public static void main (String args[]){
        new DemoGui();
    }



}
