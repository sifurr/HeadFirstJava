import java.awt.Color;

import javax.swing.*;

public class MyFrame extends JFrame
{
    public MyFrame()
    {
        this.setTitle("My Gui");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(500, 500);
        this.setVisible(true);
        
        // app logo
        ImageIcon logo = new ImageIcon("logo.png");
        this.setIconImage(logo.getImage()); //change the icon of the frame

        // change background color of the frame
        this.getContentPane().setBackground(Color.PINK);
    }    
}
