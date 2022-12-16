import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3 implements ActionListener
{
    private JFrame frame;

    public static void main(String[] args) 
    {
        SimpleGui3 gui = new SimpleGui3();
        gui.go();    
    }    

    public void go()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JButton button = new JButton("change color");
        button.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();
        
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setVisible(true);       
    }

    public void actionPerformed(ActionEvent event)
    {
        frame.repaint();
    }
}
