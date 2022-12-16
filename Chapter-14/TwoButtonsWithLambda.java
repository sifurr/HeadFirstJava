import javax.swing.*;
import java.awt.BorderLayout;


public class TwoButtonsWithLambda 
{
    private JFrame frame;
    private JLabel label;    

    public static void main(String[] args) 
    {
        TwoButtonsWithLambda gui = new TwoButtonsWithLambda();
        gui.go();
    }

    public void go()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(event -> frame.repaint());

        JButton labelButton = new JButton("Chane Label");
        labelButton.addActionListener(event -> label.setText("Ouch!"));

        MyDrawPanel drawPanel = new MyDrawPanel();
        label = new JLabel("I'm a Label");

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}
