package Exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JButton b1, b2, b3, b4, b5,b6, b7, b8,b9,b0, bCE, bDot, bPlus, bMinus, bMolt, bDiv, bEqual;
    JTextField textField;
    JFrame frame = new JFrame();
    JPanel panel;
    double number1;
    double number2;
    //constructor
    public Calculator(){
        double number1;
        double number2;
        this.setTitle("Calculator");
        panel= new JPanel();
        panel.setLayout(new GridLayout(5,4,20,10));
        panel.setSize(new Dimension( 400, 200));
        panel.add(b0= new JButton("0"));
        panel.add(b1= new JButton("1"));
        panel.add(b2= new JButton("2"));
        panel.add(b3= new JButton("3"));
        panel.add(b4= new JButton("4"));
        panel.add(b5= new JButton("5"));
        panel.add(b6= new JButton("6"));
        panel.add(b7= new JButton("7"));
        panel.add(b8= new JButton("8"));
        panel.add(b9= new JButton("9"));
        panel.add(bDot= new JButton("."));
        panel.add(bCE= new JButton("CE"));
        panel.add(bPlus= new JButton("+"));
        panel.add(bMinus= new JButton("-"));
        panel.add(bMolt= new JButton("x"));
        panel.add(bDiv= new JButton("/"));
        panel.add(bEqual= new JButton("="));

        JPanel panel2= new JPanel();
        panel2.setLayout(new GridLayout(1,1, 20 ,10));
        panel2.add(textField = new JTextField(10));
        textField.setEditable(false);
        textField.setBackground(Color.WHITE);

        Container container = this.getContentPane();
        container.add(panel2, BorderLayout.NORTH);
        container.add(panel, BorderLayout.CENTER);
        this.pack();
        this.setVisible(true);
        this.setSize(400, 250);
        //this.setResizable(false);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      b0.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              textField.setText( textField.getText()+"0");
          }
      });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+"1");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+"2");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+"3");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+"4");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+"5");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+"6");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+"7");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+"8");
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+"9");
            }
        });
        bDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText( textField.getText()+".");
                bDot.setEnabled(false);
            }
        });
        bCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(" ");
                bDot.setEnabled(true);
            }
        });



    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

    }


}
