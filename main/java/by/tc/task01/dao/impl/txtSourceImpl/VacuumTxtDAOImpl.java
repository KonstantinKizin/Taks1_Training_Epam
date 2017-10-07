package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class VacuumTxtDAOImpl extends AbstractAppliencTxtDAO{
    @Override
    protected String getTypeName() {
        return "VacuumCleaner";
    }

    @Override
    protected Appliance buildAppliance(Map<String, String> appliancMap) {

        VacuumCleaner vacuum = new VacuumCleaner();

        vacuum.setBagType(appliancMap.get(SearchCriteria.VacuumCleaner.BAG_TYPE.name()));

        vacuum.setFilterType(appliancMap.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.name()));

        vacuum.setWandType(appliancMap.get(SearchCriteria.VacuumCleaner.WAND_TYPE.name()));

        vacuum.setCleaningWidth(Float.parseFloat(appliancMap.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name())));

        vacuum.setPowerConsumption(Float.parseFloat(appliancMap.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name())));

        vacuum.setMotorSpeedRegulation(Float.parseFloat(appliancMap.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name())));

        return vacuum;
    }
}
