public class SongV4 implements Comparable<SongV4>
{
    private String title;
    private String artist;
    private int bpm;

    SongV4(String title, String artist, int bpm)
    {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    @Override
    public int compareTo(SongV4 s) {
        
        return title.compareTo(s.getTitle());
    }

    @Override
    public boolean equals(Object aSong)
    {
        SongV4 other = (SongV4) aSong;
        return title.equals(other.getTitle());
    }

    @Override
    public int hashCode()
    {
        return title.hashCode();
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getBpm()
    {
        return bpm;
    }

    @Override
    public String toString()
    {
        return title;
    }
}

