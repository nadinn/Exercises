package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonBackground extends JFrame {
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;
    JFrame frame= new JFrame();
    JPanel panel = new JPanel();


    public ButtonBackground()  {
        redButton= new JButton("RED");
        blueButton =new JButton("BLUE");
        greenButton = new JButton("GREEN");

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(redButton);
        panel.add(greenButton);
        panel.add(blueButton);

        //BLUE
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.BLUE);
            }
        });

        //RED
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });

        // GREEN
        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        ButtonBackground b =new ButtonBackground();
    }
}
