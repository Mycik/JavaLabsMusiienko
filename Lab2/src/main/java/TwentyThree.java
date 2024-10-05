import java.util.HashMap;
import java.util.Map;

public class TwentyThree {
    public Map<Integer, Integer> findDuplicateElements(int[] array) {
        Map<Integer, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicates.put(i, array[i]);
                    break;
                }
            }
        }
        return duplicates;
    }
}
