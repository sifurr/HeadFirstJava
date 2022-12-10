import java.util.*;

public class Jukebox7 
{
    public static void main(String[] args) 
    {
        new Jukebox7().go();
    }    
    
    public void go()
    {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        // Collections.sort(songList);
        // TitleCompare titleCompare = new TitleCompare();
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println("Ascending order: " + songList);

        // ArtistCompare artistCompare = new ArtistCompare();
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println("Ascending order: " + songList);

        // order by bpm
        songList.sort((one, two) -> one.getBpm() - two.getBpm());
        System.out.println("Order by BPM: " + songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println("Ascending order: " + songList);
      
        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
        System.out.println("Descending order: " + songList);
    }    
}

