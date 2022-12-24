

public class ShortJob implements Runnable
{
    private String jobName;

    public ShortJob(String string) 
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

