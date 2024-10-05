import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть сторону a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть сторону b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть сторону c: ");
        double c = scanner.nextDouble();

        System.out.print("Введіть сторону d: ");
        double d = scanner.nextDouble();

        System.out.print("Введіть діагональ e: ");
        double e = scanner.nextDouble();

        Nineteen task = new Nineteen();
        task.CalculateArea(a, b, c, d, e);
    }

    private void CalculateArea(double a, double b, double c, double d, double e) {

        double semiP1 = (a + b + e) / 2;
        double area1 = sqrt(semiP1 * (semiP1 - a) * (semiP1 - b) * (semiP1 - e));

        double semiP2 = (c + d + e) / 2;
        double area2 = sqrt(semiP2 * (semiP2 - c) * (semiP2 - d) * (semiP2 - e));


        double totalArea = area1 + area2;

        System.out.println("Площа чотирикутника: " + totalArea);
    }
}
