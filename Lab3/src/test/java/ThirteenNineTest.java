import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ThirteenNineTest {

    private String[] args;

    @BeforeEach
    void setUp() {
        args = new String[]{"1f", "abcdf", "sdfsdf"};
    }

    @Test
    void testConvertingArguments() {
        List<String> results = ThirteenNine.ConvertingArguments(args);

        assertTrue(results.contains("Argument: 1f -> Binary: 11111"));
        assertTrue(results.contains("Argument: abcdf -> Binary: 10101011110011011111"));
        assertTrue(results.contains("Argument: sdfsdf -> Type: String"));
        assertTrue(results.contains("Total hex arguments: 2"));
    }
}
