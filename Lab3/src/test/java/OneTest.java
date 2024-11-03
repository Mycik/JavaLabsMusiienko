import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class OneTest {

    private String[] _arrayAnswers;

    @BeforeEach
    void setUp() {
        _arrayAnswers = new String[]{"a", "1e", "32", "46", "5a"};
    }

    @Test
    void testCalculateHexadecimal() {
        List<String> result = One.CalculateHexadecimal(10, 100, 20);
        assertArrayEquals(_arrayAnswers, result.toArray());
    }
}
