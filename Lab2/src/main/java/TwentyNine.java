import java.util.HashSet;
import java.util.Set;

public class TwentyNine {
    public Set<Integer> findRepeatedElements(int[] array) {
        Set<Integer> allElements = new HashSet<>();
        Set<Integer> repeatedElements = new HashSet<>();

        for (int num : array) {
            if (!allElements.add(num)) {
                repeatedElements.add(num);
            }
        }
        return repeatedElements;
    }
}
