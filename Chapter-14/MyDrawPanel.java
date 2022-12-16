import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        Random random = new Random();
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);
        Color startColor = new Color(red, green, blue);

        red = random.nextInt(256);
        green = random.nextInt(256);
        blue = random.nextInt(256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);

        // g.setColor(Color.orange);
        // g.fillRect(0, 0, this.getWidth(), this.getHeight());        
        // g.setColor(color);
        // g.fillOval(70, 70, 100, 100);
        // Image image = new ImageIcon("catbilla.png").getImage();
        // g.drawImage(image, 3, 4, this);

    }
}
