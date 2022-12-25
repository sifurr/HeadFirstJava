import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RyanAndMonicaTest 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount();
        RyanMonicaJob ryan = new RyanMonicaJob("Ryan", account, 50);
        RyanMonicaJob monica = new RyanMonicaJob("Monica", account, 100);
        
        // both thread will access the only one account
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(ryan);
        executor.execute(monica);
        executor.shutdown();
    }    
}


