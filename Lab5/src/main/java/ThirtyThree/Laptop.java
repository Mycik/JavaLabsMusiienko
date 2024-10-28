package ThirtyThree;

public class Laptop extends Computer {
    private double screenDiagonal;
    private double weight;
    private int batteryCapacity;

    public Laptop(String name, double processorFrequency, int coreCount, int ramSize, int storageSize, double screenDiagonal, double weight, int batteryCapacity) {
        super(name, processorFrequency, coreCount, ramSize, storageSize);
        this.screenDiagonal = screenDiagonal;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public double getWeight() {
        return weight;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", screenDiagonal=" + screenDiagonal + " inches, weight=" + weight + " kg, batteryCapacity=" + batteryCapacity + " mAh";
    }
}
