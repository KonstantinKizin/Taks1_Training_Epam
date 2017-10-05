package by.tc.task01.entity;

public class Speakers extends Appliance{

    private float powerConsumption;

    private int numberOfSpeakers;

    private float frequencyRange;

    private float cordLenght;

    public Speakers(){

    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public float getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(float frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public float getCordLenght() {
        return cordLenght;
    }

    public void setCordLenght(float cordLenght) {
        this.cordLenght = cordLenght;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Speakers speakers = (Speakers) o;

        if (Float.compare(speakers.powerConsumption, powerConsumption) != 0) return false;
        if (numberOfSpeakers != speakers.numberOfSpeakers) return false;
        if (Float.compare(speakers.frequencyRange, frequencyRange) != 0) return false;
        return Float.compare(speakers.cordLenght, cordLenght) == 0;
    }

    @Override
    public int hashCode() {
        int result = (powerConsumption != +0.0f ? Float.floatToIntBits(powerConsumption) : 0);
        result = 31 * result + numberOfSpeakers;
        result = 31 * result + (frequencyRange != +0.0f ? Float.floatToIntBits(frequencyRange) : 0);
        result = 31 * result + (cordLenght != +0.0f ? Float.floatToIntBits(cordLenght) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLenght=" + cordLenght +
                '}';
    }


}
