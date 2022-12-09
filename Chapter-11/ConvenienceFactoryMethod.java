import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvenienceFactoryMethod 
{
    public static void main(String[] args) 
    {
        // Creating a list: List.of()
        List<String> strings = List.of("somersault", "cassidy", "$10");
        List<SongV4> songs = List.of(
                                    new SongV4("somersault", "zero 7", 147),
                                    new SongV4("cassidy", "grateful dead", 158),
                                    new SongV4("$10", "hitchhiker", 140)     
                                );

        // Creatign a set: Set.of()
        Set<Book> books = Set.of(
                                new Book("How Cats Work"),
                                new Book("Remix your body"),
                                new Book("Finding Emo")
                                );

        // Creatign a map: Map.of(), Map.ofEntries()
        // Map.of() for less than 10 entries
        Map<String, Integer> scores = Map.of(
                                    "Kathy", 42,
                                    "Bert", 343,
                                    "Skyler", 420
                                    );
        // Map.ofEntries() for more than 10 entries
        Map<String, String> stores = Map.ofEntries(
                                    Map.entry("Riley", "Supersports"),
                                    Map.entry("Brooklyn", "Camera World"),
                                    Map.entry("Jay", "Homecase")
                                    );

    }   

}
