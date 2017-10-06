package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
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

        Map<E,Object> map = criteria.getCriteria();
        Set entitySet = map.entrySet();

        List<String> criterians = new ArrayList<String>();

        for(Object o : entitySet){
            criterians.add(o.toString());
        }



        Appliance appliance = null;
        try {
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.startsWith("Oven : ")) {
                    int count = 0;
                    for(String buf : criterians){
                        if(line.contains(buf)){
                            count = count + 1;
                        }
                    }
                    if(count == criterians.size()){

                        Map<String ,String> objectMap = new HashMap<String, String>();

                        String[] lineArr = line.split(" ");

                        String[] entrySet = new String[lineArr.length - 2];

                        System.arraycopy(lineArr , 2 , entrySet, 0 , lineArr.length - 2);

                        int lenght = entrySet.length;

                       for(int i = 0; i < lenght; i++){

                           int spaceIndex = entrySet[i].indexOf("=");

                           String key = entrySet[i].substring(0, spaceIndex );
                           String value = entrySet[i].substring((spaceIndex+1),entrySet[i].length() - 1);
                           objectMap.put(key , value);
                       }

                        appliance = buildAppliance(objectMap);

                    }
                    //1)проверить на соответствие критерия.
                    // если да, построить обьект и вернуть.

                }
            }
        }catch (IOException e){
            throw new DAOException(e);
        }catch (Exception e){
            throw new DAOException(e);
        }finally {
            if(reader != null){
                reader.close();
            }
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
