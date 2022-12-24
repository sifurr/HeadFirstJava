public class LongJob implements Runnable
{
    private String jobName;

    public LongJob(String string) 
    {
        this.jobName = string;
    }

    @Override
    public void run() 
    {
        job(jobName);        
    }

    public void job(String job)
    {
        System.out.println(job);
    }
}
