import java.io.*;

public class GameSaverTest 
{
    public static void main(String[] args) 
    {
        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "dust"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[] {"bare hands", "big ax"}); 
        GameCharacter three = new GameCharacter(120, "Magician", new String[] {"spells", "invisibility"}); 
        
        // saving the game characters
        try
        {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));

            // serialize the characters
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        // now restore the game characters
        try
        {
            // now read them back in from the files
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            // restore the characters
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("One's type: " + oneRestore.getType());
            System.out.println("Two's type: " + twoRestore.getType());
            System.out.println("Three's type: " + threeRestore.getType());

            is.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }        
    }
}
