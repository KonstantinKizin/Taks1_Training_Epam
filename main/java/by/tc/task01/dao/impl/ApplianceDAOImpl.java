package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO{

	private Scanner reader ;

	private PrintWriter writer;



	@Override
	public <E> Appliance find(Criteria<E> criteria) {

		Appliance appliance = null  ;

		File file = new File("src"+File.separator+"main"+File.separator+"resources"+File.separator+"appliances_db.txt");





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


}


class ResultSet{



}

class Connection{







}


