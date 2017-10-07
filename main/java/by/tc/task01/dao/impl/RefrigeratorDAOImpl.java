package by.tc.task01.dao.impl;

import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.FileParser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.IOException;
import java.util.Map;

public class RefrigeratorDAOImpl extends ApplianceDAOImpl {
    @Override
    public <E> Appliance find(Criteria<E> criteria) {
        FileParser fileParser = new FileParser(super.file , criteria);
        Appliance appliance = null;
        try {
            Map<String , String> appMap = fileParser.getApplianceMap("Refrigerator");

            if(appMap != null) {
                appliance = buildAppliance(appMap);
            }
        }catch (IOException e){
            throw new DAOException(e);
        }catch (Exception e){
            throw new DAOException(e);
        }
        return appliance;
    }


    private Refrigerator buildAppliance(Map<String, String> appliancMap){

        Refrigerator ref = new Refrigerator();

        ref.setFreezerCapacity(Float.parseFloat(appliancMap.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name())));

        ref.setHeight(Float.parseFloat(appliancMap.get(SearchCriteria.Refrigerator.HEIGHT.name())));

        ref.setOvrallCapacity(Float.parseFloat(appliancMap.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name())));

        ref.setPowerConsumption(Float.parseFloat(appliancMap.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name())));

        ref.setWeight(Float.parseFloat(appliancMap.get(SearchCriteria.Refrigerator.WEIGHT.name())));

        ref.setWidth(Float.parseFloat(appliancMap.get(SearchCriteria.Refrigerator.WIDTH.name())));

        return ref;
    }

}
