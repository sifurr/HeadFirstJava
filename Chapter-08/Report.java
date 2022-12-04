// Invoking the superclass version of a method
public abstract class Report 
{
    void runReport()
    {
        // 
    }

    void printReport()
    {
        //
    }
}

class BuzzwordsRport extends Report
{
    @Override
    void runReport()
    {
        // call super class version of runReport() them do some 
        // subclass specific stuff
        super.runReport();
        buzzwordCompliance();
        printReport();
    }

    private void buzzwordCompliance() 
    {
        //
    }
}
