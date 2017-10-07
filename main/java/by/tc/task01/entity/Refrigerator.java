package by.tc.task01.entity;

public class Refrigerator extends Appliance{

    private float powerConsumption;

    private float weight;

    private float freezerCapacity;

    private float ovrallCapacity;

    private float height;

    private float width;

    public Refrigerator(){

    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(float freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public float getOvrallCapacity() {
        return ovrallCapacity;
    }

    public void setOvrallCapacity(float ovrallCapacity) {
        this.ovrallCapacity = ovrallCapacity;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refrigerator that = (Refrigerator) o;

        if (Float.compare(that.powerConsumption, powerConsumption) != 0) return false;
        if (Float.compare(that.weight, weight) != 0) return false;
        if (Float.compare(that.freezerCapacity, freezerCapacity) != 0) return false;
        if (Float.compare(that.ovrallCapacity, ovrallCapacity) != 0) return false;
        if (Float.compare(that.height, height) != 0) return false;
        return Float.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result = (powerConsumption != +0.0f ? Float.floatToIntBits(powerConsumption) : 0);
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (freezerCapacity != +0.0f ? Float.floatToIntBits(freezerCapacity) : 0);
        result = 31 * result + (ovrallCapacity != +0.0f ? Float.floatToIntBits(ovrallCapacity) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        result = 31 * result + (width != +0.0f ? Float.floatToIntBits(width) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", ovrallCapacity=" + ovrallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

}
