import java.util.*;

public class Jukebox9 
{
    public static void main(String[] args) 
    {
        new Jukebox9().go();
    }    
    
    public void go()
    {
        List<SongV4> songList = MockSongs.getSongsV4();
        System.out.println(songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        Set<SongV4> songSet = new HashSet<>(songList);
        System.out.println(songSet);

    }    
}

