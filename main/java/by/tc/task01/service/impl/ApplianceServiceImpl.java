package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.impl.ApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import static by.tc.task01.service.validation.Validator.criteriaValidator;

import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	private ApplianceDAO applianceDAO = new ApplianceDAOImpl();


	@Override
	public <E> Appliance find(Criteria<E> criteria) {

		boolean valid = criteriaValidator(criteria);

		if (valid) {
			return applianceDAO.find(criteria);
		}else {
			return null;
		}
	}



	@Override
	public <E> boolean add(Criteria<E> criteria) {

		if(!criteriaValidator(criteria)){
			return false;
		}else {
			return applianceDAO.add(criteria);
		}
	}


	@Override
	public <E> boolean delete(Criteria<E> criteria) {

		if(criteriaValidator(criteria)){
			return applianceDAO.delete(criteria);
		}else {
			return false;
		}
	}

	@Override
	public <E> void updateOrAdd(Criteria<E> criteria) {
		applianceDAO.updateOrAdd(criteria);
	}

	@Override
	public <E> List<Appliance> getAll() {
		return new ArrayList<Appliance>(applianceDAO.getAll());
	}

}
