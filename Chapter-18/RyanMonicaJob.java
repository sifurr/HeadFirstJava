
public class RyanMonicaJob implements Runnable
{
    private final String name;
    private final BankAccount account;
    private final int amountToSpend;

    public RyanMonicaJob(String name, BankAccount account, int amountToSpend)
    {
        this.name = name;
        this.account = account;
        this.amountToSpend = amountToSpend;
    }

    @Override
    public void run()
    {
        goShopping(amountToSpend);
    }

    public void goShopping(int amount)
    {                
        System.out.println(name + " is about to spend");
        account.spend(name, amount);
        System.out.println(name + " finishes spending");      
    }
}
