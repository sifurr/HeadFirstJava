import java.io.*;
import java.util.Arrays;

public class GameCharacter implements Serializable
{
    private final int power;
    private final String type;
    private final String[] weapons;

    static final long serialVersionUID = -1297982167816135868L;

    public GameCharacter(int power, String type, String[] weapons)
    {
        this.power = power;
        this.type = type;
        this.weapons = weapons;
    }

    public int getPower()
    {
        return power;
    }

    public String getType()
    {
        return type;
    }

    public String getWeapons()
    {
        return Arrays.toString(weapons);
    }
}
