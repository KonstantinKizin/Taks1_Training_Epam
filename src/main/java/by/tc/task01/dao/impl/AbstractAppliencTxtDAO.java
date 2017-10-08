package by.tc.task01.dao.impl;

import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.FileParser;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public abstract class AbstractAppliencTxtDAO extends ApplianceDAOImpl {

    private   final String   PATH = "src"+File.separator+"main"+File.separator+"resources"+File.separator+"appliances_db.txt";

    private   final File file = new File(PATH);

    protected abstract String getTypeName();

    protected abstract Appliance buildAppliance(Map<String, String> appliancMap);

    @Override
    public  <E> Appliance find(Criteria<E> criteria)  {
        FileParser fileParser = new FileParser(file , criteria);
        Appliance appliance = null;
        try {
            Map<String , String> appMap = fileParser.getApplianceMap(getTypeName());
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










}
