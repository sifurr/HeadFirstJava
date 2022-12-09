import java.util.Map;
import java.util.HashMap;

public class TestMap 
{
    public static void main(String[] args)
    {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);

        System.out.println(scores);
        System.out.println(scores.get("Kathy"));
    }    
}