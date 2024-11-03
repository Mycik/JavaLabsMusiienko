package Thirteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square(4.0);
    }

    @Test
    void testGetSide() {
        assertEquals(4.0, square.getSide());
    }

    @Test
    void testSetSide() {
        square.setSide(5.0);
        assertEquals(5.0, square.getSide());
    }

    @Test
    void testCalculateArea() {
        assertEquals(16.0, square.calculateArea());
    }

    @Test
    void testCalculatePerimeter() {
        assertEquals(16.0, square.calculatePerimeter());
    }

    @Test
    void testSetSideNegative() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            square.setSide(-1.0);
        });
        assertEquals("Side length must be positive", exception.getMessage());
    }

    @Test
    void testSetSideZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            square.setSide(0.0);
        });
        assertEquals("Side length must be positive", exception.getMessage());
    }

    @Test
    void testToString() {
        String expectedString = "Square: side=4.0";
        assertEquals(expectedString, square.toString());
    }

    @Test
    void testEquals() {
        Square anotherSquare = new Square(4.0);
        assertEquals(square, anotherSquare);
    }

    @Test
    void testNotEquals() {
        Square anotherSquare = new Square(5.0);
        assertNotEquals(square, anotherSquare);
    }

    @Test
    void testHashCode() {
        Square anotherSquare = new Square(4.0);
        assertEquals(square.hashCode(), anotherSquare.hashCode());
    }
}
