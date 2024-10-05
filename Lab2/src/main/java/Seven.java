public class Seven {
    public int findMinAbsDifference(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Масив повинен містити принаймні два елементи");
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int diff = Math.abs(array[i] - array[j]);
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
        }
        return minDiff;
    }
}
