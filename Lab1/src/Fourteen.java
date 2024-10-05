import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть катет a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть катет b: ");
        double b = scanner.nextDouble();

        Fourteen task = new Fourteen();
        task.CalculateHeightAndHypotenuse(a, b);
    }

    private void CalculateHeightAndHypotenuse(double a, double b) {

        double hypotenuse = sqrt(a * a + b * b);

        double height = (a * b) / hypotenuse;

        System.out.println("Гіпотенуза: " + hypotenuse);
        System.out.println("Висота, опущена на гіпотенузу: " + height);
    }
}
