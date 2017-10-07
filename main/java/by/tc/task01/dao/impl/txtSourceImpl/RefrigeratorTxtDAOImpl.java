package by.tc.task01.dao.impl.txtSourceImpl;

import by.tc.task01.dao.impl.AbstractAppliencTxtDAO;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class RefrigeratorTxtDAOImpl extends AbstractAppliencTxtDAO {

    @Override
    protected String getTypeName(){
        return "Refrigerator";
    }



    @Override
    protected Refrigerator buildAppliance(Map<String, String> appliancMap){

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
