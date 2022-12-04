public class TestFormats 
{
    public static void main(String[] args) 
    {
        long myBillion = 1_000_000_000;
        // number to have commas
        String s1 = String.format("%,d", myBillion);
        System.out.println(s1);
        
        String s2 = String.format("%,.2f", 476578.09876);
        System.out.println(s2);
    }
}