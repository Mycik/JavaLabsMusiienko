import java.util.ArrayList;
import java.util.List;

public class Seventeen {

    public static List<String> CheckArgumentsType(String[] args) {
        List<String> results = new ArrayList<>();
        results.add("Total arguments: " + args.length);
        for (var arg : args) {
            if (arg.matches("[-+]?\\d*\\.?\\d+"))
                results.add("Argument: " + arg + " -> Type: Decimal");
            else
                results.add("Argument: " + arg + " -> Type: String");
        }
        return results;
    }

    public static void main(String[] args) {
        List<String> results = CheckArgumentsType(new String[] {"1515.515", "Happy Birthday"});
        results.forEach(System.out::println);
    }
}
