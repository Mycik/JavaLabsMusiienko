package One;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HyperbolaTest {
    private Hyperbola hyperbola;

    @BeforeEach
    void setUp() {
        hyperbola = new Hyperbola(5, 10);
    }

    @Test
    void testCalculateY() {
        double x = 2;
        double expectedY = hyperbola.getA() * hyperbola.getB() / x;
        assertEquals(expectedY, hyperbola.calculateY(x));
    }

    @Test
    void testCalculateX() {
        double y = 15;
        double expectedX = hyperbola.getA() * hyperbola.getB() / y;
        assertEquals(expectedX, hyperbola.calculateX(y));
    }

    @Test
    void testSetValues() {
        hyperbola.setValues(3, 7);
        assertEquals(3, hyperbola.getA());
        assertEquals(7, hyperbola.getB());
    }

    @Test
    void testToString() {
        String expectedString = "Hyperbola: a=5.0, b=10.0";
        assertEquals(expectedString, hyperbola.toString());
    }

    @Test
    void testEquals() {
        Hyperbola anotherHyperbola = new Hyperbola(5, 10);
        assertEquals(hyperbola, anotherHyperbola);
    }

    @Test
    void testHashCode() {
        Hyperbola anotherHyperbola = new Hyperbola(5, 10);
        assertEquals(hyperbola.hashCode(), anotherHyperbola.hashCode());
    }

    @Test
    void testNotEquals() {
        Hyperbola anotherHyperbola = new Hyperbola(6, 10);
        assertNotEquals(hyperbola, anotherHyperbola);
    }
}
