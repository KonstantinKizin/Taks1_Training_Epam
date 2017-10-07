package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.FileParser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.IOException;
import java.util.*;

public class OvenDAOImpl extends ApplianceDAOImpl {

    @Override
    public <E> Appliance find(Criteria<E> criteria) {

        FileParser fileParser = new FileParser(super.file , criteria);

        Appliance appliance = null;
        try {
            Map<String , String> appMap = fileParser.getApplianceMap("Oven");
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


    private Oven buildAppliance( Map<String, String> appliancMap){

        Oven oven = new Oven();

        oven.setCapacity(Float.parseFloat(appliancMap.get(SearchCriteria.Oven.CAPACITY.name())));

        oven.setDepth(Float.parseFloat(appliancMap.get(SearchCriteria.Oven.DEPTH.name())));

        oven.setHeight(Float.parseFloat(appliancMap.get(SearchCriteria.Oven.HEIGHT.name())));

        oven.setPowerConsuption(Float.parseFloat(appliancMap.get(SearchCriteria.Oven.POWER_CONSUMPTION.name())));

        oven.setWeight(Float.parseFloat(appliancMap.get(SearchCriteria.Oven.WEIGHT.name())));

        oven.setWidth(Float.parseFloat(appliancMap.get(SearchCriteria.Oven.WIDTH.name())));

        return oven;
    }


}
