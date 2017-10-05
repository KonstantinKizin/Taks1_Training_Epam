package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;


import java.util.HashMap;
import java.util.Map;

public class Laptop extends Appliance{

    private float batareyCapacity;

    private String os;

    private float memoryRom;

    private float systemMemory;

    private float cpu;

    private float displayInchs;

    public Laptop(){


    }


    public float getBatareyCapacity() {
        return batareyCapacity;
    }

    public void setBatareyCapacity(int batareyCapacity) {
        this.batareyCapacity = batareyCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(float memoryRom) {
        this.memoryRom = memoryRom;
    }

    public float getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(float systemMemory) {
        this.systemMemory = systemMemory;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public float getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(float displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public Map<Object , Object> getFields(){

        Map<Object , Object> fields= new HashMap<Object , Object>();

        fields.put(SearchCriteria.Laptop.BATTERY_CAPACITY, this.batareyCapacity);
        fields.put(SearchCriteria.Laptop.OS , this.os);
        fields.put(SearchCriteria.Laptop.CPU,this.cpu);
        fields.put(SearchCriteria.Laptop.DISPLAY_INCHS, this.displayInchs);
        fields.put(SearchCriteria.Laptop.SYSTEM_MEMORY,this.systemMemory);
        fields.put(SearchCriteria.Laptop.MEMORY_ROM , this.memoryRom);

        return fields;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (Float.compare(laptop.batareyCapacity, batareyCapacity) != 0) return false;
        if (Float.compare(laptop.memoryRom, memoryRom) != 0) return false;
        if (Float.compare(laptop.systemMemory, systemMemory) != 0) return false;
        if (Float.compare(laptop.cpu, cpu) != 0) return false;
        if (Float.compare(laptop.displayInchs, displayInchs) != 0) return false;
        return os.equals(laptop.os);
    }

    @Override
    public int hashCode() {
        int result = (batareyCapacity != +0.0f ? Float.floatToIntBits(batareyCapacity) : 0);
        result = 31 * result + os.hashCode();
        result = 31 * result + (memoryRom != +0.0f ? Float.floatToIntBits(memoryRom) : 0);
        result = 31 * result + (systemMemory != +0.0f ? Float.floatToIntBits(systemMemory) : 0);
        result = 31 * result + (cpu != +0.0f ? Float.floatToIntBits(cpu) : 0);
        result = 31 * result + (displayInchs != +0.0f ? Float.floatToIntBits(displayInchs) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batareyCapacity=" + batareyCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                '}';
    }

    // you may add your own code here
}
