import java.util.*;

public class Jukebox6 
{
    public static void main(String[] args) 
    {
        new Jukebox6().go();
    }    
    
    public void go()
    {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        // Collections.sort(songList);
        // TitleCompare titleCompare = new TitleCompare();
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println("Title: Ascending order: " + songList);

        // descending order by title 
        songList.sort((one, two) -> two.getTitle().compareTo(one.getTitle()));
        System.out.println("Title: Descending order: " + songList);

        // ArtistCompare artistCompare = new ArtistCompare();
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println("Artist: Ascending order: " + songList);

        // order by bpm
        songList.sort((one, two) -> one.getBpm() - two.getBpm());
        System.out.println("Order by BPM: " + songList);

    }    
}



/* 
class TitleCompare implements Comparator<SongV3>
{
    public int compare(SongV3 one, SongV3 two)
    {
        return one.getTitle().compareTo(two.getTitle());
    }
}

class ArtistCompare implements Comparator<SongV3>
{
    public int compare(SongV3 one, SongV3 two)
    {
        return one.getArtist().compareTo(two.getArtist());
    }
} 
*/


