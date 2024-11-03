import java.util.ArrayList;
import java.util.List;

public class One {
    public  static List<String> CalculateHexadecimal(int start, int end, int step) {
        List<String> HexadecimalList = new ArrayList<>();
        for (int i = start; i <= end; i += step) {
            String hexValue = Integer.toHexString(i);
            HexadecimalList.add(hexValue);
            System.out.printf("Decimal: %d -> Hexadecimal: %s%n", i, hexValue);
        }
        return HexadecimalList;
    }

    public static void main(String[] args) {
        System.out.println("Decimal to Hexadecimal Conversion:");
        CalculateHexadecimal(10, 100, 20);
    }
}
