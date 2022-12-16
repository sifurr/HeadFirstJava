public class MyOuterClass 
{
    private int x;
    
    MyInnerClass inner = new MyInnerClass();

    public void doStuff()
    {
        inner.go();
    }
    
    class MyInnerClass
    {
        public void go()
        {
            x = 44;
        }
    } // close inner class
} // class outer class
