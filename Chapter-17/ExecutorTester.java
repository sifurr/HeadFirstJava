import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTester 
{
    public static void main(String[] args) 
    {
        Runnable job = new MyRunable();
        
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(job);

        System.out.println(Thread.currentThread().getName() + ": back in the main");
        Thread.dumpStack();
        executor.shutdown();
    }    
}
