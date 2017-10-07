package by.tc.task01.dao.impl;

import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.FileParser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import java.io.IOException;

import java.util.Map;


public class LaptopDaoImpl extends ApplianceDAOImpl {

    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        FileParser fileParser = new FileParser(super.file , criteria);
        Appliance appliance = null;
        try {
            Map<String , String> appMap = fileParser.getApplianceMap("Laptop");
            if (appMap != null) {
                appliance = buildAppliance(appMap);
            }
        }catch (IOException e){
            throw new DAOException(e);
        }catch (Exception e){
            throw new DAOException(e);
        }
        return appliance;
    }


    private Laptop buildAppliance(Map<String, String> appliancMap){

        Laptop laptop = new Laptop();

        laptop.setBatareyCapacity((Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.BATTERY_CAPACITY.name()))));

        laptop.setCpu(Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.CPU.name())));

        laptop.setDisplayInchs(Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.DISPLAY_INCHS.name())));

        laptop.setMemoryRom(Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.MEMORY_ROM.name())));

        laptop.setOs(appliancMap.get(SearchCriteria.Laptop.OS.name()));

        laptop.setSystemMemory(Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.SYSTEM_MEMORY.name())));

        return laptop;
    }
}
