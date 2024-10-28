package One;

import java.util.Objects;

public class Hyperbola implements IHyperbola {
    private double a;
    private double b;

    public Hyperbola(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateY(double x) {
        return a * b / x;
    }

    @Override
    public double calculateX(double y) {
        return a * b / y;
    }

    @Override
    public void setValues(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Hyperbola: a=" + a + ", b=" + b;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Hyperbola that = (Hyperbola) obj;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
