package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OvenDAOImpl implements ApplianceDAO {

    private static final String  PATH = "src"+ File.separator+"main"+File.separator+"resources"+File.separator+"appliances_db.txt";

    private static final File file = new File(PATH);

    private Scanner reader ;

    private PrintWriter writer;


    @Override
    public <E> Appliance find(Criteria<E> criteria) throws IOException {

        Map<E,Object> map = criteria.getCriteria();



        Appliance appliance = null;
        try {
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.startsWith("Oven : ")) {
                    appliance = buildAppliance(line);
                }
            }
        }catch (IOException e){
            throw e;
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



    private Oven buildAppliance(String resultSet){

        Oven oven = new Oven();


        return oven;
    }
}
