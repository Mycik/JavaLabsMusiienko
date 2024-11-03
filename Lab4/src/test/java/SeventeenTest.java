import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.TreeSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SeventeenTest {
    private Seventeen seventeen;

    @BeforeEach
    void setUp() {
        seventeen = new Seventeen();
        seventeen.addBook(1001, new Book("Java Programming", "Ivanov", "Ivan", "Ivanovich", "PublisherA", 2020, 29.99f));
        seventeen.addBook(1002, new Book("Data Structures", "Petrov", "Petr", "Petrovich", "PublisherB", 2019, 19.99f));
        seventeen.addBook(1003, new Book("Data Programming", "Dmitrov", "Dmitro", "Dmitrievich", "PublisherC", 2021, 39.99f));
        seventeen.addBook(1004, new Book("Java Structures", "Nikitov", "Nikita", "Nikitovich", "PublisherD", 2022, 9.99f));
        seventeen.addBook(1005, new Book("Java Data Programming", "Androv", "Andrii", "Andrievich", "PublisherF", 2023, 5.99f));
    }

    @Test
    void testFindBookByISBN() {
        Book book = seventeen.findBookByISBN(1002);
        assertEquals("Data Structures", book.title);
        assertEquals("Petrov", book.authorSurname);

        assertNull(seventeen.findBookByISBN(9999));
    }

    @Test
    void testGetSortedBooksByAuthor() {
        ArrayList<Book> sortedBooksByAuthor = seventeen.getSortedBooksByAuthor();
        assertEquals("Androv", sortedBooksByAuthor.get(0).authorSurname);
        assertEquals("Dmitrov", sortedBooksByAuthor.get(1).authorSurname);
        assertEquals("Ivanov", sortedBooksByAuthor.get(2).authorSurname);
        assertEquals("Nikitov", sortedBooksByAuthor.get(3).authorSurname);
        assertEquals("Petrov", sortedBooksByAuthor.get(4).authorSurname);
    }

    @Test
    void testGetSortedBooksByYear() {
        ArrayList<Book> sortedBooksByYear = seventeen.getSortedBooksByYear();
        assertEquals(2019, sortedBooksByYear.get(0).year);
        assertEquals(2020, sortedBooksByYear.get(1).year);
        assertEquals(2021, sortedBooksByYear.get(2).year);
        assertEquals(2022, sortedBooksByYear.get(3).year);
        assertEquals(2023, sortedBooksByYear.get(4).year);
    }

    @Test
    void testGetUniqueTitles() {
        TreeSet<String> uniqueTitles = seventeen.getUniqueTitles();
        assertEquals(5, uniqueTitles.size());
        assertEquals(true, uniqueTitles.contains("Java Programming"));
        assertEquals(true, uniqueTitles.contains("Data Structures"));
        assertEquals(true, uniqueTitles.contains("Data Programming"));
        assertEquals(true, uniqueTitles.contains("Java Structures"));
        assertEquals(true, uniqueTitles.contains("Java Data Programming"));
    }
}