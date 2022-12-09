import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 
{
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "string");
        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        System.out.println("Limit: " + limit);

        // long result1 = limit.count();
        // System.out.println("result= " + result1);

        List<String> result2 = limit.collect(Collectors.toList());
        System.out.println(result2);
    }    
}
