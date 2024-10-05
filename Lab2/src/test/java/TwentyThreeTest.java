import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TwentyThreeTest {

    private TwentyThree _twentyThree = new TwentyThree();
    private int[] _array;

    @BeforeEach
    void setUp() {
        _array = new int[] {1, 8, 1, 4, 3, 3, 5};
    }

    @Test
    void findDuplicateElements() {
        Map<Integer, Integer> result = _twentyThree.findDuplicateElements(_array);
        assertEquals(2, result.size());
        assertTrue(result.containsKey(3));
        assertTrue(result.containsKey(1));
    }
}