public class Duck 
{   
    int size;
    private static int duckCount = 0;

    public Duck()
    {
        duckCount++;
    }
   

    public int getSize() 
    {
        return size;
    }    

    public void setSize(int newSize) 
    {
        size = newSize;
    }

}

