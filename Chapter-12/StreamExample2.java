import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 
{
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "string");
        List<String> result = strings
                                .stream()
                                .sorted() // // sort what's  in the stream natuarally without any condition
                                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2)) // sort natuarally with condition to ignore upper case
                                .skip(2)
                                .limit(4)
                                .collect(Collectors.toList()); // return them as a list
        System.out.println(result);
    }    
}
