import java.io.*;

public class ReadAFile 
{
    public static void main(String[] args) 
    {
        try 
        {
            File file = new File("MyText.txt"); 
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }    
}
