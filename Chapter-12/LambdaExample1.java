import java.util.List;

public class LambdaExample1
{
    public static void main(String[] args) {
        List<String> allColors = List.of("Red", "Yellow", "Blue");
        allColors.forEach(color -> System.out.println(color));
    }
}