public class One {
    private static void CalculateHexadecimal(int start, int end, int step){
        for (var i = start; i <= end; i += step)
            System.out.printf("Decimal: %d -> Hexadecimal: %s%n", i, Integer.toHexString(i));
    }

    public static void main(String[] args) {
        System.out.println("Decimal to Hexadecimal Conversion:");
        CalculateHexadecimal(10, 100, 20);
    }
}