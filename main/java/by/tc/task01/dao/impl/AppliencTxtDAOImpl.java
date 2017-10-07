package by.tc.task01.dao.impl;

import java.io.File;

public abstract class AppliencTxtDAOImpl extends ApplianceDAOImpl {

    protected  final String  PATH = "src"+ File.separator+"main"+File.separator+"resources"+File.separator+"appliances_db.txt";

    protected  final File file = new File(PATH);










}
