import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SeventeenTest {

    private String[] args;

    @BeforeEach
    void setUp() {
        args = new String[]{"1515.515", "Happy Birthday"};
    }

    @Test
    void testCheckArgumentsType() {
        List<String> results = Seventeen.CheckArgumentsType(args);

        assertTrue(results.contains("Argument: 1515.515 -> Type: Decimal"));
        assertTrue(results.contains("Argument: Happy Birthday -> Type: String"));
    }
}
