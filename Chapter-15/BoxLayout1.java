
import javax.swing.*;
import java.awt.*;

public class BoxLayout1 
{
    public static void main(String[] args) 
    {
        BoxLayout1 gui = new BoxLayout1();
        gui.go();
    }

    public void go()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonOne = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        panel.setBackground(Color.darkGray);
        panel.add(buttonOne);
        panel.add(buttonTwo);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
    
}
