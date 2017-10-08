package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.*;

public class OvenTxtDAOImpl extends AbstractAppliencTxtDAO {

    @Override
    protected String getTypeName(){
        return "Oven";
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
