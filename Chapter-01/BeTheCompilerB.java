/**
 * This class will not compile as it needs to include
 * inside of a class 
 */

public class BeTheCompilerB 
{
    public static void main(String[] args) {
        int x = 5;
        while(x > 1)
        {
            x = x - 1;
            if(x < 3)
            {
                System.out.println("small x");
            }
        }
    }    
}