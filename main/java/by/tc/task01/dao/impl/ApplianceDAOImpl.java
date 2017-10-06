package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


public class ApplianceDAOImpl implements ApplianceDAO{


	@Override
	public <E> Appliance find(Criteria<E> criteria) throws IOException  {
		Appliance appliance = null;
		try {
			appliance = new OvenDAOImpl().find(criteria);
		} catch (IOException e) {
			throw e;
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




