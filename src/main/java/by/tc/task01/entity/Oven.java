package by.tc.task01.entity;

public class Oven extends Appliance{

    private float powerConsuption;

    private float weight;

    private float capacity;

    private float depth;

    private float height;

    private float width;

    public Oven(){

    }


    public float getPowerConsuption() {
        return powerConsuption;
    }

    public void setPowerConsuption(float powerConsuption) {
        this.powerConsuption = powerConsuption;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
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

        Oven oven = (Oven) o;

        if (Float.compare(oven.powerConsuption, powerConsuption) != 0) return false;
        if (Float.compare(oven.weight, weight) != 0) return false;
        if (Float.compare(oven.capacity, capacity) != 0) return false;
        if (Float.compare(oven.depth, depth) != 0) return false;
        if (Float.compare(oven.height, height) != 0) return false;
        return Float.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        int result = (powerConsuption != +0.0f ? Float.floatToIntBits(powerConsuption) : 0);
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (capacity != +0.0f ? Float.floatToIntBits(capacity) : 0);
        result = 31 * result + (depth != +0.0f ? Float.floatToIntBits(depth) : 0);
        result = 31 * result + (height != +0.0f ? Float.floatToIntBits(height) : 0);
        result = 31 * result + (width != +0.0f ? Float.floatToIntBits(width) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsuption=" + powerConsuption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
