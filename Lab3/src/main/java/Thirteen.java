import java.util.HashMap;
import java.util.Map;

public class Thirteen {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String encrypt(String text, String key) {
        Map<Character, Character> cipher = new HashMap<>();
        for (int i = 0; i < ALPHABET.length(); i++)
            cipher.put(ALPHABET.charAt(i), key.charAt(i));

        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray())
            encrypted.append(cipher.getOrDefault(c, c));

        return encrypted.toString();
    }

    public static String decrypt(String text, String key) {
        Map<Character, Character> decipher = new HashMap<>();
        for (int i = 0; i < ALPHABET.length(); i++)
            decipher.put(key.charAt(i), ALPHABET.charAt(i));

        StringBuilder decrypted = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray())
            decrypted.append(decipher.getOrDefault(c, c));

        return decrypted.toString();
    }

    public static void main(String[] args) {
        String key = "QWERTYUIOPASDFGHJKLZXCVBNM"; // Замінний ключ
        String text = "HELLO WORLD";
        String encrypted = encrypt(text, key);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypt(encrypted, key));
    }
}
