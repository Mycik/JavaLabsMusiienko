package ThirtyThree;

import java.util.Objects;

public class Computer implements IComputer {
    private String name;
    private double processorFrequency;
    private int coreCount;
    private int ramSize;
    private int storageSize;

    public Computer(String name, double processorFrequency, int coreCount, int ramSize, int storageSize) {
        this.name = name;
        this.processorFrequency = processorFrequency;
        this.coreCount = coreCount;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    @Override
    public void setSpecs(String name, double processorFrequency, int coreCount, int ramSize, int storageSize) {
        this.name = name;
        this.processorFrequency = processorFrequency;
        this.coreCount = coreCount;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getProcessorFrequency() {
        return processorFrequency;
    }

    @Override
    public int getCoreCount() {
        return coreCount;
    }

    @Override
    public int getRamSize() {
        return ramSize;
    }

    @Override
    public int getStorageSize() {
        return storageSize;
    }

    @Override
    public String toString() {
        return "Computer: name=" + name + ", processorFrequency=" + processorFrequency + "GHz, cores=" + coreCount + ", RAM=" + ramSize + "GB, storage=" + storageSize + "GB";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return Double.compare(computer.processorFrequency, processorFrequency) == 0 && coreCount == computer.coreCount &&
                ramSize == computer.ramSize && storageSize == computer.storageSize && name.equals(computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, processorFrequency, coreCount, ramSize, storageSize);
    }
}
