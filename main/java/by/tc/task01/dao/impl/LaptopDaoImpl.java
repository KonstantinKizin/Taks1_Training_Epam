package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;


import java.util.Map;


public class LaptopDaoImpl extends ApplianceDAOImpl {


    @Override
    protected String getTypeName(){
        return "Laptop";
    }

    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        return super.find(criteria);
    }


    @Override
    protected Laptop buildAppliance(Map<String, String> appliancMap){

        Laptop laptop = new Laptop();

        laptop.setBatareyCapacity(Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.BATTERY_CAPACITY.name())));

        laptop.setCpu(Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.CPU.name())));

        laptop.setDisplayInchs(Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.DISPLAY_INCHS.name())));

        laptop.setMemoryRom(Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.MEMORY_ROM.name())));

        laptop.setOs(appliancMap.get(SearchCriteria.Laptop.OS.name()));

        laptop.setSystemMemory(Float.parseFloat(appliancMap.get(SearchCriteria.Laptop.SYSTEM_MEMORY.name())));

        return laptop;
    }
}
