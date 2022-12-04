public class Duck 
{   
    int size;

    public Duck( )
    {
        System.out.println("Quack");
        System.out.println("size is " + size);
    }

    public Duck(int duckSize) 
    {
        System.out.println("Quack");
        size = duckSize;
        System.out.println("size is " + size);
    }
    
    public void setSize(int newSize) 
    {
        size = newSize;
    }
}


class UseADuck 
{
    public static void main(String[] args) 
    {
        Duck d = new Duck(33);
        d.setSize(0);
    }
}