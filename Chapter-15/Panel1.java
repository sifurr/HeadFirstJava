
import javax.swing.*;
import java.awt.*;

public class Panel1 
{
    public static void main(String[] args) 
    {
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonOne = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.add(buttonOne);
        panel.add(buttonTwo);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
    
}
