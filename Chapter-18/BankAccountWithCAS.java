import java.util.concurrent.atomic.AtomicInteger;

public class BankAccountWithCAS 
{
    private final AtomicInteger balance = new AtomicInteger(100);

    public int getBalance()
    {
        return balance.get();
    }

    public void spend(String name, int amount)
    {
        int initialBalance = balance.get();
        if(initialBalance >= amount)
        {
            boolean success = balance.compareAndSet(initialBalance, initialBalance - amount);
            if(!success)
            {
                System.out.println("Sorry " + name + ", haven't spend the money.");
            }
        }
        else
        {
            System.out.println("Sorry, not enough for " + name);
        }
    }
}
