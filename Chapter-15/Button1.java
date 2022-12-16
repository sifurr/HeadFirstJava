import javax.swing.*;
import java.awt.*;

public class Button1 
{
    public static void main(String[] args) 
    {
        Button1 gui = new Button1();
        gui.go();
    }    

    public void go()
    {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonEast = new JButton("click like we mean it");
        JButton buttonNorth = new JButton("there is no spoon...");
        
        Font bigFont = new Font("serif", Font.BOLD, 30);
        buttonNorth.setFont(bigFont);
        
        frame.getContentPane().add(BorderLayout.EAST, buttonEast);
        frame.getContentPane().add(BorderLayout.NORTH, buttonNorth);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
