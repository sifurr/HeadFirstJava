import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Jukebox1 
{
    public static void main(String[] args) 
    {
        new Jukebox1().go();
    }    
    
    public void go()
    {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}

