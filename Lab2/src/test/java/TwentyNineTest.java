import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TwentyNineTest {

    private TwentyNine _twentyNine = new TwentyNine();
    private int[] _array;

    @BeforeEach
    void setUp() {
        _array = new int[] {1, 8, 1, 4, 3, 3, 5};
    }

    @Test
    void findRepeatedElements() {
        Set<Integer> result = _twentyNine.findRepeatedElements(_array);
        assertEquals(2, result.size());
        assertTrue(result.contains(3));
        assertTrue(result.contains(1));
    }
}