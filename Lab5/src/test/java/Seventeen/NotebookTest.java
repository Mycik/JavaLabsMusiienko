package Seventeen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotebookTest {
    private Notebook notebook;

    @BeforeEach
    void setUp() {
        notebook = new Notebook("John Doe", "johndoe", "+123456789", "johndoe@example.com", "123456");
    }

    @Test
    void testGetName() {
        assertEquals("John Doe", notebook.getName());
    }

    @Test
    void testGetNickname() {
        assertEquals("johndoe", notebook.getNickname());
    }

    @Test
    void testGetPhoneNumber() {
        assertEquals("+123456789", notebook.getPhoneNumber());
    }

    @Test
    void testGetEmail() {
        assertEquals("johndoe@example.com", notebook.getEmail());
    }

    @Test
    void testGetICQNumber() {
        assertEquals("123456", notebook.getICQNumber());
    }

    @Test
    void testSetName() {
        notebook.setName("Jane Doe");
        assertEquals("Jane Doe", notebook.getName());
    }

    @Test
    void testSetNickname() {
        notebook.setNickname("janedoe");
        assertEquals("janedoe", notebook.getNickname());
    }

    @Test
    void testSetPhoneNumber() {
        notebook.setPhoneNumber("+987654321");
        assertEquals("+987654321", notebook.getPhoneNumber());
    }

    @Test
    void testSetEmail() {
        notebook.setEmail("janedoe@example.com");
        assertEquals("janedoe@example.com", notebook.getEmail());
    }

    @Test
    void testSetICQNumber() {
        notebook.setICQNumber("654321");
        assertEquals("654321", notebook.getICQNumber());
    }

    @Test
    void testToString() {
        String expectedString = "Notebook: name=John Doe, nickname=johndoe, phone=+123456789, email=johndoe@example.com, ICQ=123456";
        assertEquals(expectedString, notebook.toString());
    }

    @Test
    void testEquals() {
        Notebook anotherNotebook = new Notebook("John Doe", "johndoe", "+123456789", "johndoe@example.com", "123456");
        assertEquals(notebook, anotherNotebook);
    }

    @Test
    void testNotEquals() {
        Notebook anotherNotebook = new Notebook("Jane Doe", "janedoe", "+987654321", "janedoe@example.com", "654321");
        assertNotEquals(notebook, anotherNotebook);
    }

    @Test
    void testHashCode() {
        Notebook anotherNotebook = new Notebook("John Doe", "johndoe", "+123456789", "johndoe@example.com", "123456");
        assertEquals(notebook.hashCode(), anotherNotebook.hashCode());
    }
}
