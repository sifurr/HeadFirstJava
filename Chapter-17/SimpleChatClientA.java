import java.awt.BorderLayout;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import static java.nio.charset.StandardCharsets.UTF_8;

public class SimpleChatClientA 
{
    private JTextField outGoing;
    private PrintWriter writer;  

    public static void main(String[] args) 
    {
        new SimpleChatClientA().go();
    }

    public void go()
    {
        // call the method that will connect to the server
        setUpNetworking();

        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        outGoing = new JTextField(20);

        JButton sendButton = new JButton("send");
        sendButton.addActionListener(e -> sendMessage());

        JPanel mainPanel = new JPanel();
        mainPanel.add(outGoing);
        mainPanel.add(sendButton);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 100);
        frame.setVisible(true);
    } // end go


    public void setUpNetworking()
    {          
        try
        {
            InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
            // open a socket channel that connects to the server
            SocketChannel socketChannel = SocketChannel.open(serverAddress);
            // write to the socket channel
            writer = new PrintWriter(Channels.newWriter(socketChannel, UTF_8));
            System.out.println("Networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // end setUpNetworking

    private void sendMessage()
    {
        // actual writing happens here
        writer.println(outGoing.getText());
        writer.flush();
        outGoing.setText("");
        outGoing.requestFocus();
    }

}
