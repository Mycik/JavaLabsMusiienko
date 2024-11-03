import java.util.ArrayList;
import java.util.List;

public class ThirteenNine {

    public static List<String> ConvertingArguments(String[] args) {
        List<String> results = new ArrayList<>();
        int hexCount = 0;
        results.add("Total arguments: " + args.length);
        for (String arg : args) {
            if (arg.matches("^[0-9A-Fa-f]+$")) {
                String binary = Integer.toBinaryString(Integer.parseInt(arg, 16));
                results.add("Argument: " + arg + " -> Binary: " + binary);
                hexCount++;
            } else {
                results.add("Argument: " + arg + " -> Type: String");
            }
        }
        results.add("Total hex arguments: " + hexCount);
        return results;
    }

    public static void main(String[] args) {
        List<String> results = ConvertingArguments(new String[] {"1f", "abcdf", "sdfsdf"});
        results.forEach(System.out::println);
    }
}
