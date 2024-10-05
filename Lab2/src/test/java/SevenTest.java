import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SevenTest {

    private Seven _seven = new Seven();
    private int[] _array;

    @BeforeEach
    void setUp() {
        _array = new int[] {1, 20, 15, 13, 10, 3, 5};
    }

    @Test
    void findMinAbsDifference() {
        assertEquals(3,_seven.findMinAbsDifference(_array));
    }
}