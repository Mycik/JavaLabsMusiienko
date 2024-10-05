import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть сторону a: ");
        float a = scanner.nextFloat();

        System.out.print("Введіть сторону b: ");
        float b = scanner.nextFloat();

        System.out.print("Введіть сторону c: ");
        float c = scanner.nextFloat();

        Five five = new Five();
        five.CalculateArea(a, b, c);
    }

    private void CalculateArea(float a, float b, float c) {

        var semiP = (a + b + c) / 2;
        var area = sqrt(semiP * (semiP - a) * (semiP - b) * (semiP - c));

        System.out.println("Площа трикутника: " + area);
    }
}
