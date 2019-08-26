package Exercise;

import javax.swing.*;

public class ButtonTest extends JFrame {
    private JButton imageButton1;

    public ButtonTest(){
        ImageIcon map1 = new ImageIcon(("C:\\Users\\Nadin\\IdeaProjects\\Exercises\\src\\Exercise\\m1.jpg"));
        imageButton1 = new JButton("Map ", map1);
        imageButton1.setRolloverEnabled(true);
        imageButton1.setRolloverIcon(new ImageIcon(("C:\\Users\\Nadin\\IdeaProjects\\Exercises\\src\\Exercise\\m2.jpg")));
        getContentPane().add(imageButton1);
        this.pack();
    }
    public static void main(String args[]){
        new ButtonTest().setVisible(true);
    }
}


