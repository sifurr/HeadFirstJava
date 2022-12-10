import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SongPrinter 
{
    public static void main(String[] args) 
    {
        
        List<Song> songs = new Songs().getSongs();        
        // System.out.println("All Songs: " + songs);
        System.out.println();
        // use of filer
        List<Song> rockSongs1 = songs
                                .stream()
                                .filter(song -> song.getGenre().equals("Rock"))
                                .collect(Collectors.toList());
        System.out.println("Only Rocks:");
        System.out.println(rockSongs1);
        System.out.println();

        // use of filer
        List<Song> rockSongs2 = songs
                                .stream()
                                .filter(song -> song.getGenre().contains("Rock"))
                                .collect(Collectors.toList());
        System.out.println("Rocks word related all songs:");
        System.out.println(rockSongs2);                          
        System.out.println();    

        // use of multiple filer
        List<Song> popSongs = songs
                                .stream()                                
                                .filter(song -> song.getArtist().contains("The Beatles"))
                                .filter(song -> song.getTitle().startsWith("H"))
                                .filter(song -> song.getYear() > 1995)
                                .collect(Collectors.toList());
        System.out.println("Song by Beatles:");
        System.out.println(popSongs);                          
        System.out.println();        
        
        // use of map [convert song to string]
        List<String> songByGenre1 = songs
                                .stream()
                                .map(song -> song.getGenre())
                                .collect(Collectors.toList());
        System.out.println("Song by genre:");
        System.out.println(songByGenre1);                          
        System.out.println();     
        
        // use of map [convert song to string]
        List<String> songByGenre2 = songs
                                .stream()
                                .map(song -> song.getGenre())
                                .distinct() // remove duplicates
                                .collect(Collectors.toList());
        System.out.println("Song by genre without any duplicate:");
        System.out.println(songByGenre2);                          
        System.out.println(); 

        // use of method reference and map [convert song to string] 
        List<String> songByGenre3 = songs
                                .stream()
                                .map(Song::getGenre) // as we know what map can do we can simply 
                                                     //use the method reference inststead of lambda
                                .distinct() // remove duplicates
                                .collect(Collectors.toList());
        System.out.println("Song by genre without any duplicate using Method Reference:");
        System.out.println(songByGenre3);                          
        System.out.println(); 

        // All songs sorted with lambda 
        List<Song> allSongsByLambda = songs
                              .stream()
                              .sorted((obj1, obj2) -> obj1.getYear() - obj2.getYear())
                              .collect(Collectors.toList());
        System.out.println("Songs sorted by using lambda");
        System.out.println(allSongsByLambda);                          
        System.out.println();       
        
        // another use of method reference to sort songs
        List<Song> allSongsByMethodRefewrence = songs
                              .stream()
                              .sorted(Comparator.comparingInt(Song::getYear))
                              .collect(Collectors.toList());
        System.out.println("Songs sorted by using method reference");
        System.out.println(allSongsByMethodRefewrence);                          
        System.out.println(); 





    }
}
