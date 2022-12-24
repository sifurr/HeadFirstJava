import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.awt.BorderLayout;

public class SimpleChatClientV2 
{
    private JTextArea incoming;
    private JTextField outGoing;
    private BufferedReader reader;
    private PrintWriter writer;

    public static void main(String[] args) 
    {
        new SimpleChatClientV2().go();    
    }

    public void go()
    {
        setUpNetworking();
        JScrollPane scroller = createScrollableTextArea();

        outGoing = new JTextField(20);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(e -> sendMessage());
        
        JPanel mainPanel = new JPanel();
        mainPanel.add(scroller);
        mainPanel.add(outGoing);
        mainPanel.add(sendButton);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new IncomingReader());

        JFrame frame = new JFrame("Ludicrously Simple Chat Client V:2");
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }

    private void sendMessage() 
    {
        writer.println(outGoing.getText());
        writer.flush();
        outGoing.setText("");
        outGoing.requestFocus();        
    }

    private JScrollPane createScrollableTextArea() 
    {
        incoming = new JTextArea(15, 30);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);

        JScrollPane scroller = new JScrollPane(incoming);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return scroller;
    }

    private void setUpNetworking() 
    {
        try 
        {
            InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
            SocketChannel socketChannel = SocketChannel.open(serverAddress);

            reader = new BufferedReader(Channels.newReader(socketChannel, UTF_8));
            writer = new PrintWriter(Channels.newWriter(socketChannel, UTF_8));

            System.out.println("Networking established.");

        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    // inner class
    public class IncomingReader implements Runnable
    {

        @Override
        public void run() 
        {
            String message;
            try 
            {
                while ((message = reader.readLine()) != null) 
                {
                    System.out.println("read " + message);
                    incoming.append(message + "\n");    
                }    
            } catch (IOException e) {
                e.printStackTrace();
            }
        }        
    } // end IncomingReader class


} // end SimpleChatServer class




