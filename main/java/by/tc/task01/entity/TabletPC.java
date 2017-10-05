package by.tc.task01.entity;

public class TabletPC extends Appliance{

    private float batareyCapacity;

    private float displayInchs;

    private float memoryRom;

    private float flashMemoryCapacity;

    private String color;

    public TabletPC(){

    }

    public float getBatareyCapacity() {
        return batareyCapacity;
    }

    public void setBatareyCapacity(float batareyCapacity) {
        this.batareyCapacity = batareyCapacity;
    }

    public float getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(float displayInchs) {
        this.displayInchs = displayInchs;
    }

    public float getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(float memoryRom) {
        this.memoryRom = memoryRom;
    }

    public float getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(float flashMemoryCapacity) {
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
        if (o == null || getClass() != o.getClass()) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (Float.compare(tabletPC.batareyCapacity, batareyCapacity) != 0) return false;
        if (Float.compare(tabletPC.displayInchs, displayInchs) != 0) return false;
        if (Float.compare(tabletPC.memoryRom, memoryRom) != 0) return false;
        if (Float.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) != 0) return false;
        return color != null ? color.equals(tabletPC.color) : tabletPC.color == null;
    }

    @Override
    public int hashCode() {
        int result = (batareyCapacity != +0.0f ? Float.floatToIntBits(batareyCapacity) : 0);
        result = 31 * result + (displayInchs != +0.0f ? Float.floatToIntBits(displayInchs) : 0);
        result = 31 * result + (memoryRom != +0.0f ? Float.floatToIntBits(memoryRom) : 0);
        result = 31 * result + (flashMemoryCapacity != +0.0f ? Float.floatToIntBits(flashMemoryCapacity) : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batareyCapacity=" + batareyCapacity +
                ", displayInchs=" + displayInchs +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }


}
