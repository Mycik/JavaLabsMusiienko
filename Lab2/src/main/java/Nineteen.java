import java.util.HashMap;
import java.util.Map;

public class Nineteen {
    public Map<Integer, Integer> findUniqueElements(int[] array) {
        Map<Integer, Integer> elementCount = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            elementCount.put(array[i], elementCount.getOrDefault(array[i], 0) + 1);
        }

        Map<Integer, Integer> uniqueElements = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (elementCount.get(array[i]) == 1) {
                uniqueElements.put(i, array[i]);
            }
        }
        return uniqueElements;
    }
}
