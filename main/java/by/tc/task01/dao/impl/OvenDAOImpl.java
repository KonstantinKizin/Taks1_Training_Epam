package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.*;

public class OvenDAOImpl extends ApplianceDAOImpl {

    @Override
    protected String getTypeName(){
        return "Oven";
    }

    @Override
    public <E> Appliance find(Criteria<E> criteria) {

        return super.find(criteria);
    }


    @Override
    protected Oven buildAppliance( Map<String, String> appliancMap){

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
