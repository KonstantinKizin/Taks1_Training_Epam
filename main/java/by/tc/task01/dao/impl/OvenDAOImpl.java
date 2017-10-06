package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.FileParser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class OvenDAOImpl implements ApplianceDAO {

    private static final String  PATH = "src"+ File.separator+"main"+File.separator+"resources"+File.separator+"appliances_db.txt";

    private static final File file = new File(PATH);

    private Scanner reader ;

    private PrintWriter writer;


    @Override
    public <E> Appliance find(Criteria<E> criteria) {

        FileParser fileParser = new FileParser(file , criteria);

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

    @Override
    public <E> boolean add(Criteria<E> criteria) {
        return false;
    }

    @Override
    public <E> boolean delete(Criteria<E> criteria) {
        return false;
    }

    @Override
    public <E> void updateOrAdd(Criteria<E> criteria) {

    }

    @Override
    public <E> List<Appliance> getAll() {
        return null;
    }



    private Oven buildAppliance( Map<String, String> appliancMap){

        Oven oven = new Oven();

        oven.setCapacity(Float.valueOf(appliancMap.get(SearchCriteria.Oven.CAPACITY.name())));

        oven.setDepth(Float.valueOf(appliancMap.get(SearchCriteria.Oven.DEPTH.name())));

        oven.setHeight(Float.valueOf(appliancMap.get(SearchCriteria.Oven.HEIGHT.name())));

        oven.setPowerConsuption(Float.valueOf(appliancMap.get(SearchCriteria.Oven.POWER_CONSUMPTION.name())));

        oven.setWeight(Float.valueOf(appliancMap.get(SearchCriteria.Oven.WEIGHT.name())));

        oven.setWidth(Float.valueOf(appliancMap.get(SearchCriteria.Oven.WIDTH.name())));

        return oven;
    }


}
