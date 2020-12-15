package by.epam.training.jwd.task02.entity.appliance;

import java.util.Objects;

public class Speakers implements Appliance{

    private double powerConsumption;
    private double numberOfSpeakers;
    private double frequencyRange;
    private double cordLength;

    public Speakers() {
    }

    public Speakers(double powerConsumption, double numberOfSpeakers, double frequencyRange,
                    double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(double frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.getPowerConsumption(), getPowerConsumption()) == 0 &&
                Double.compare(speakers.getNumberOfSpeakers(), getNumberOfSpeakers()) == 0 &&
                Double.compare(speakers.getFrequencyRange(), getFrequencyRange()) == 0 &&
                Double.compare(speakers.getCordLength(), getCordLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPowerConsumption(), getNumberOfSpeakers(), getFrequencyRange(), getCordLength());
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength +
                '}';
    }
}
