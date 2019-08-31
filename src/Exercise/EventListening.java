package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventListening extends JFrame {
    private JButton additionButton, subtractionButton;
    private JLabel myLabel;
    private int count ;

    public EventListening(){

        myLabel = new JLabel("Total: " + count, JLabel.CENTER);
        myLabel.setPreferredSize(new Dimension(100,50));
        additionButton = new JButton("ADD");
        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count = count+1;
                myLabel.setText("Total: " + (count));
            }
        });
        subtractionButton = new JButton("SUBTRACT");
        subtractionButton.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myLabel.setText(("Total: "+ (--count)));
            }
        }));
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(BorderLayout.WEST, additionButton);
        c.add(BorderLayout.EAST, subtractionButton);
        c.add(BorderLayout.CENTER, myLabel);
        this.pack();
        this.setVisible(true);
    }
    public static void main(String args []){
        EventListening e = new EventListening();
    }

}
