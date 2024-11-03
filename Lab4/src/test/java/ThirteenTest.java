import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ThirteenTest {
    private Thirteen thirteen;

    @BeforeEach
    void setUp() {
        thirteen = new Thirteen();
        thirteen.addAbonent(1, new LibraryAbonent("Ivanov", "Ivan", "Ivanovich", "Kyiv"));
        thirteen.addAbonent(2, new LibraryAbonent("Petrov", "Petr", "Petrovich", "Lviv"));
        thirteen.addAbonent(3, new LibraryAbonent("Dmitrov", "Dmitro", "Dmitrievich", "Druzhkivka"));
        thirteen.addAbonent(4, new LibraryAbonent("Nikitov", "Nikita", "Nikitovich", "Volnogorsk"));
        thirteen.addAbonent(5, new LibraryAbonent("Androv", "Andrii", "Andrievich", "Nikolaiv"));
    }

    @Test
    void testFindAbonentById() {
        LibraryAbonent abonent = thirteen.findAbonentById(2);
        assertEquals("Petrov", abonent.surname);
        assertEquals("Petr", abonent.name);

        assertNull(thirteen.findAbonentById(10));
    }

    @Test
    void testUpdateAbonent() {
        LibraryAbonent newAbonent = new LibraryAbonent("Smirnov", "Sergey", "Sergeevich", "Odesa");
        thirteen.updateAbonent(3, newAbonent);

        LibraryAbonent updatedAbonent = thirteen.findAbonentById(3);
        assertEquals("Smirnov", updatedAbonent.surname);
        assertEquals("Sergey", updatedAbonent.name);
        assertEquals("Sergeevich", updatedAbonent.patronymic);
        assertEquals("Odesa", updatedAbonent.address);
    }

    @Test
    void testGetSortedAbonentsBySurname() {
        ArrayList<LibraryAbonent> sortedAbonents = thirteen.getSortedAbonentsBySurname();
        assertEquals("Androv", sortedAbonents.get(0).surname);
        assertEquals("Dmitrov", sortedAbonents.get(1).surname);
        assertEquals("Ivanov", sortedAbonents.get(2).surname);
        assertEquals("Nikitov", sortedAbonents.get(3).surname);
        assertEquals("Petrov", sortedAbonents.get(4).surname);
    }
}