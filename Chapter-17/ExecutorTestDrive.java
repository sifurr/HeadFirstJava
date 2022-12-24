import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestDrive 
{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> System.out.println("top of the stack"));

        System.out.println("back in the main");
        executor.shutdown();
    }    
}
