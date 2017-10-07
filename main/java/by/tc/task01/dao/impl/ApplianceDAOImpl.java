package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.io.File;
import java.util.List;


public class ApplianceDAOImpl implements ApplianceDAO{

	protected  final String  PATH = "src"+ File.separator+"main"+File.separator+"resources"+File.separator+"appliances_db.txt";

	protected  final File file = new File(PATH);

	@Override
	public <E> Appliance find(Criteria<E> criteria)  {
		Appliance appliance = null;
		try {
			appliance = new OvenDAOImpl().find(criteria);
		} catch (DAOException e) {
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


}




