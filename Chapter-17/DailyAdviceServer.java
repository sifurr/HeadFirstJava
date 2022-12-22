import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Random;

public class DailyAdviceServer 
{
    private final String[] adviceList = 
            {
                "Take smaller bites",
                "Go for the tight jeans. No they do NOT make you look fat.",
                "One word: inappropriate",
                "Just for today, be honest. Tell your boss what you *really* think",
                "You might want to rethink that haircut."
            };
    private final Random random = new Random();

    public static void main(String[] args) 
    {
        new DailyAdviceServer().go();    
    } // end main    

    public void go()
    {
        try(ServerSocketChannel serverChannel = ServerSocketChannel.open())
        {
            serverChannel.bind(new InetSocketAddress(5000));

            while(serverChannel.isOpen())
            {
                SocketChannel clientChannel = serverChannel.accept();
                PrintWriter writer = new PrintWriter(Channels.newOutputStream(clientChannel));

                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            } // end while
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } // end try/catch
    } // end go

    public String getAdvice()
    {
        int nextAdvice = random.nextInt(adviceList.length);
        return adviceList[nextAdvice];
    }
} // end class
