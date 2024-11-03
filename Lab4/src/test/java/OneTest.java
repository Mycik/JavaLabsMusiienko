import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OneTest {
    private One one;

    @BeforeEach
    void setUp() {
        one = new One();
        one.addAbonent(123456789, new Abonent("Ivanov", "Ivan", "Ivanovich", "Kyiv"));
        one.addAbonent(987654321, new Abonent("Petrov", "Petr", "Petrovich", "Lviv"));
        one.addAbonent(515161925, new Abonent("Dmitrov", "Dmitro", "Dmitrievich", "Druzhkivka"));
        one.addAbonent(728817822, new Abonent("Nikitov", "Nikita", "Nikitovich", "Volnogorsk"));
        one.addAbonent(198952525, new Abonent("Androv", "Andrii", "Andrievich", "Nikolaiv"));
    }

    @Test
    void testGetSortedAbonentsByFields() {
        List<Abonent> sortedAbonents = one.getSortedAbonentsByFields();
        assertEquals("Androv", sortedAbonents.get(0).surname);
        assertEquals("Dmitrov", sortedAbonents.get(1).surname);
        assertEquals("Ivanov", sortedAbonents.get(2).surname);
        assertEquals("Nikitov", sortedAbonents.get(3).surname);
        assertEquals("Petrov", sortedAbonents.get(4).surname);
    }
}