import java.nio.file.*;

public class Install 
{
    public static void main(String[] args) 
    {
        try 
        {
            Path myPath = Paths.get("MyApp");    
            Path myPath2 = Paths.get("MyApp", "media");
            Path myPath3 = Paths.get("MyApp", "source");
            Path mySource = Paths.get("MyApp.class");
            Path myMedia = Paths.get("MyMedia.jpeg");

            Files.createDirectory(myPath);
            Files.createDirectory(myPath2);
            Files.createDirectory(myPath3);
            Files.move(mySource, myPath3.resolve(mySource.getFileName())); 
            Files.move(myMedia, myPath2.resolve(myMedia.getFileName()));
        } 
        catch (Exception e) 
        {
            System.out.println("Got an NIO exception" + e.getMessage());
        }
    }    
}
