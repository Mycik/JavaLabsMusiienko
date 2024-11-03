package ThirtyThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    private Computer computer;

    @BeforeEach
    void setUp() {
        computer = new Computer("MyComputer", 3.5, 4, 16, 512);
    }

    @Test
    void testGetName() {
        assertEquals("MyComputer", computer.getName());
    }

    @Test
    void testGetProcessorFrequency() {
        assertEquals(3.5, computer.getProcessorFrequency());
    }

    @Test
    void testGetCoreCount() {
        assertEquals(4, computer.getCoreCount());
    }

    @Test
    void testGetRamSize() {
        assertEquals(16, computer.getRamSize());
    }

    @Test
    void testGetStorageSize() {
        assertEquals(512, computer.getStorageSize());
    }

    @Test
    void testSetSpecs() {
        computer.setSpecs("NewComputer", 4.0, 8, 32, 1024);
        assertEquals("NewComputer", computer.getName());
        assertEquals(4.0, computer.getProcessorFrequency());
        assertEquals(8, computer.getCoreCount());
        assertEquals(32, computer.getRamSize());
        assertEquals(1024, computer.getStorageSize());
    }

    @Test
    void testToString() {
        String expectedString = "Computer: name=MyComputer, processorFrequency=3.5GHz, cores=4, RAM=16GB, storage=512GB";
        assertEquals(expectedString, computer.toString());
    }

    @Test
    void testEquals() {
        Computer anotherComputer = new Computer("MyComputer", 3.5, 4, 16, 512);
        assertEquals(computer, anotherComputer);
    }

    @Test
    void testNotEquals() {
        Computer anotherComputer = new Computer("DifferentComputer", 3.0, 2, 8, 256);
        assertNotEquals(computer, anotherComputer);
    }

    @Test
    void testHashCode() {
        Computer anotherComputer = new Computer("MyComputer", 3.5, 4, 16, 512);
        assertEquals(computer.hashCode(), anotherComputer.hashCode());
    }
}

class LaptopTest {
    private Laptop laptop;

    @BeforeEach
    void setUp() {
        laptop = new Laptop("MyLaptop", 2.5, 2, 8, 256, 15.6, 1.5, 5000);
    }

    @Test
    void testGetScreenDiagonal() {
        assertEquals(15.6, laptop.getScreenDiagonal());
    }

    @Test
    void testGetWeight() {
        assertEquals(1.5, laptop.getWeight());
    }

    @Test
    void testGetBatteryCapacity() {
        assertEquals(5000, laptop.getBatteryCapacity());
    }

    @Test
    void testToString() {
        String expectedString = "Computer: name=MyLaptop, processorFrequency=2.5GHz, cores=2, RAM=8GB, storage=256GB, screenDiagonal=15.6 inches, weight=1.5 kg, batteryCapacity=5000 mAh";
        assertEquals(expectedString, laptop.toString());
    }

    @Test
    void testEquals() {
        Laptop anotherLaptop = new Laptop("MyLaptop", 2.5, 2, 8, 256, 15.6, 1.5, 5000);
        assertEquals(laptop, anotherLaptop);
    }

    @Test
    void testNotEquals() {
        Laptop anotherLaptop = new Laptop("DifferentLaptop", 3.0, 4, 16, 512, 17.0, 2.0, 6000);
        assertNotEquals(laptop, anotherLaptop);
    }

    @Test
    void testHashCode() {
        Laptop anotherLaptop = new Laptop("MyLaptop", 2.5, 2, 8, 256, 15.6, 1.5, 5000);
        assertEquals(laptop.hashCode(), anotherLaptop.hashCode());
    }
}
