package Thirteen;

import java.util.Objects;

public class Square implements ISquare {
    private double side;

    public Square(double side) {
        if (side <= 0) throw new IllegalArgumentException("Side length must be positive");
        this.side = side;
    }

    @Override
    public void setSide(double side) {
        if (side <= 0) throw new IllegalArgumentException("Side length must be positive");
        this.side = side;
    }

    @Override
    public double getSide() {
        return side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square: side=" + side;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Square square = (Square) obj;
        return Double.compare(square.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
}
