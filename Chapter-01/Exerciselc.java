/**
 * The class will not compile as the while loop 
 * can't be write without a method
 */

public class Exerciselc
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

   } // end main
}
