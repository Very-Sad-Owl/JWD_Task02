package by.epam.training.jwd.task02.entity.appliance;

import java.util.Objects;

public class TabletPC implements Appliance{

    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC() {
    }

    public TabletPC(double batteryCapacity, double displayInches, double memoryRom,
                    double flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.getBatteryCapacity(), getBatteryCapacity()) == 0 &&
                Double.compare(tabletPC.getDisplayInches(), getDisplayInches()) == 0 &&
                Double.compare(tabletPC.getMemoryRom(), getMemoryRom()) == 0 &&
                Double.compare(tabletPC.getFlashMemoryCapacity(), getFlashMemoryCapacity()) == 0 &&
                Objects.equals(getColor(), tabletPC.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBatteryCapacity(), getDisplayInches(), getMemoryRom(),
                getFlashMemoryCapacity(), getColor());
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
