package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{

    private float powerConsumption;

    private String filterType;

    private String bagType;

    private String wand_type;

    private String motorSpeedRegulation;

    private float cleaningWidth;

    public VacuumCleaner(){

    }

    public float getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(float powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWand_type() {
        return wand_type;
    }

    public void setWand_type(String wand_type) {
        this.wand_type = wand_type;
    }

    public String getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(String motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public float getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(float cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (Float.compare(that.powerConsumption, powerConsumption) != 0) return false;
        if (Float.compare(that.cleaningWidth, cleaningWidth) != 0) return false;
        if (!filterType.equals(that.filterType)) return false;
        if (!bagType.equals(that.bagType)) return false;
        if (!wand_type.equals(that.wand_type)) return false;
        return motorSpeedRegulation.equals(that.motorSpeedRegulation);
    }

    @Override
    public int hashCode() {
        int result = (powerConsumption != +0.0f ? Float.floatToIntBits(powerConsumption) : 0);
        result = 31 * result + filterType.hashCode();
        result = 31 * result + bagType.hashCode();
        result = 31 * result + wand_type.hashCode();
        result = 31 * result + motorSpeedRegulation.hashCode();
        result = 31 * result + (cleaningWidth != +0.0f ? Float.floatToIntBits(cleaningWidth) : 0);
        return result;
    }


    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wand_type='" + wand_type + '\'' +
                ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
}
