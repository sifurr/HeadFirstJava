public class ThreadTester 
{
    public static void main(String[] args) 
    {
        Runnable threadJob = new MyRunable();
        Thread myThread = new Thread(threadJob);
        
        myThread.start();

        System.out.println(Thread.currentThread().getName() + ": back in main");
        Thread.dumpStack();
    }    
}
