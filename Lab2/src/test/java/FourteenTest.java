import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class FourteenTest {

    private Fourteen _fourteen = new Fourteen();
    private int[] _array;

    @BeforeEach
    void setUp() {
        _array = new int[] {1, 8, 7, 4, 6, 3, 5};
    }

    @Test
    void isSet() {
        var testResult = _fourteen.isSet(_array);
        assertTrue(testResult);
    }
}