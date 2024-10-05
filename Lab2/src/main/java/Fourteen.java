import java.util.HashSet;
import java.util.Set;

public class Fourteen {
    public boolean isSet(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int num : array) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }
}
