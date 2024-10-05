import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть площу квадрата: ");
        double area = scanner.nextDouble();

        Seven task = new Seven();
        task.CalculateSideAndInscribingSquare(area);
    }

    private void CalculateSideAndInscribingSquare(double area) {

        double side = sqrt(area);

        double minSideForInscribingSquare = ceil(side * sqrt(2));

        System.out.println("Сторона квадрата: " + side);
        System.out.println("Мінімальна ціла сторона квадрата для вписування: " + minSideForInscribingSquare);
    }
}
