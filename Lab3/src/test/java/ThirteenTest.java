import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirteenTest {

    private String key;
    private String originalText;
    private String encryptedText;

    @BeforeEach
    void setUp() {
        key = "QWERTYUIOPASDFGHJKLZXCVBNM";
        originalText = "HELLO WORLD";
        encryptedText = "ITSSG VGKSR";
    }

    @Test
    void testEncrypt() {
        assertEquals(encryptedText, Thirteen.encrypt(originalText, key));
    }

    @Test
    void testDecrypt() {
        assertEquals(originalText, Thirteen.decrypt(encryptedText, key));
    }
}
