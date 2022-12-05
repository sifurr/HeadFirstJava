import java.util.*;

public class Jukebox5 
{
    public static void main(String[] args) 
    {
        new Jukebox5().go();
    }    
    
    public void go()
    {
        List<SongV3> songList = MockSongs.getSongsV3();
        System.out.println(songList);

        // Collections.sort(songList);
        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println(songList);
    }    
}

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

