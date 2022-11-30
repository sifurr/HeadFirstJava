/**
 * The class will compile but it will have an infenite 
 * loop as there is no counter variable to control the
 * iteration.
 */

public class Exercisela 
{
    public static void main(String[] args)
    {
        int x = 1;
        while(x < 10)
        {
            x += 1; // missing statement
            if(x > 3)
            {
                System.out.println("big x");
            }
        }
    }
}
