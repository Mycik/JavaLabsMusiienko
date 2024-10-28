package ThirtyThree;

public interface IComputer {
    void setSpecs(String name, double processorFrequency, int coreCount, int ramSize, int storageSize);
    String getName();
    double getProcessorFrequency();
    int getCoreCount();
    int getRamSize();
    int getStorageSize();
}
