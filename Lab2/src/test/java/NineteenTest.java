import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NineteenTest {

    private Nineteen _nineteen = new Nineteen();
    private int[] _array;

    @BeforeEach
    void setUp() {
        _array = new int[] {1, 20, 15, 13, 10, 3, 5};
    }

    @Test
    void findUniqueElements() {
        Map<Integer, Integer> result = _nineteen.findUniqueElements(_array);
        assertEquals(7, result.size());
        assertTrue(result.containsKey(1));
        assertTrue(result.containsKey(5));
//        assertTrue(result.containsKey(20));
    }
}