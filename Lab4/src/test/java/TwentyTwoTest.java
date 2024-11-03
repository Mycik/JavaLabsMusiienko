import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TwentyTwoTest {
    private TwentyTwo twentyTwo;

    @BeforeEach
    void setUp() {
        twentyTwo = new TwentyTwo();
        TwentyTwo.getByteList().clear();
        TwentyTwo.getByteList().add((byte) 10);
        TwentyTwo.getByteList().add((byte) 20);
        TwentyTwo.getByteList().add((byte) 30);
        TwentyTwo.getByteList().add((byte) 40);
        TwentyTwo.getByteList().add((byte) 50);
    }

    @Test
    void testInitialByteList() {
        ArrayList<Byte> expectedList = new ArrayList<>();
        expectedList.add((byte) 10);
        expectedList.add((byte) 20);
        expectedList.add((byte) 30);
        expectedList.add((byte) 40);
        expectedList.add((byte) 50);
        assertEquals(expectedList, TwentyTwo.getByteList());
    }

    @Test
    void testReplaceByteListElement() {
        TwentyTwo.replaceByteListElement(3, (byte) 126);
        assertEquals((byte) 126, TwentyTwo.getByteList().get(3));

        TwentyTwo.replaceByteListElement(0, (byte) 99);
        assertEquals((byte) 99, TwentyTwo.getByteList().get(0));
    }
}