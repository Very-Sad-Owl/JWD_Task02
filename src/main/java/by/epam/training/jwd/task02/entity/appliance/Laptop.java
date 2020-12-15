package by.epam.training.jwd.task02.entity.appliance;

import java.util.Objects;

public class Laptop implements Appliance{

	private double batteryCapacity;
	private String operationSystem;
	private double memoryRom;
	private double systemMemory;
	private double processor;
	private double displayInches;

    public Laptop() {
    }

    public Laptop(double batteryCapacity, String operationSystem, double memoryRom, double systemMemory,
                  double processor, double displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.operationSystem = operationSystem;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.processor = processor;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getProcessor() {
        return processor;
    }

    public void setProcessor(double processor) {
        this.processor = processor;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBatteryCapacity(), getBatteryCapacity()) == 0 &&
                Double.compare(laptop.getMemoryRom(), getMemoryRom()) == 0 &&
                Double.compare(laptop.getSystemMemory(), getSystemMemory()) == 0 &&
                Double.compare(laptop.getProcessor(), getProcessor()) == 0 &&
                Double.compare(laptop.getDisplayInches(), getDisplayInches()) == 0 &&
                Objects.equals(getOperationSystem(), laptop.getOperationSystem());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBatteryCapacity(), getOperationSystem(), getMemoryRom(), getSystemMemory(), getProcessor(), getDisplayInches());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", operationSystem='" + operationSystem + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", processor=" + processor +
                ", displayInches=" + displayInches +
                '}';
    }
}
